package com.example.mymusic;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnStart,btnStop,btnPause,btnReplay;     //  播放器按钮
    private SeekBar seekBar;                    //  进度条
    private MediaPlayer mediaPlayer = null;     //  音乐播放控制对象，可以操控暂停、停止、播放、重置等等
    private Object obj = new Object();      //  对象锁，播放线程暂停时，让进度条线程进入等待状态
    private Thread seekThread;            //    线程
    private ImageView imageView = null;
    private boolean isRun = false;      //  进度条线程控制
    private boolean suspended = false;  //  进度条线程等待状态控制



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();     //  初始化控件
        initJian();     //  添加监听事件

        //动画


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {              //  进度条的监听事件
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                pause();        //  进度条开始前，调用 pause()
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {              //  进度条开始后，调用 pause()
                if (mediaPlayer != null && !mediaPlayer.isPlaying()){
                    int progress2 = seekBar.getProgress();
                    int currentPosition2 = mediaPlayer.getDuration()*progress2/100;
                    continuePlay(progress2,currentPosition2);
                }
            }
        });

    }

    private void initJian() {
        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnReplay.setOnClickListener(this);
        btnPause.setOnClickListener(this);

    }

    private void initView() {
        btnStart = findViewById(R.id.btn_Start);
        btnStop = findViewById(R.id.btn_Stop);
        btnPause = findViewById(R.id.btn_Pause);
        btnReplay = findViewById(R.id.btn_Replay);
        seekBar = findViewById(R.id.seekBar);
        imageView = findViewById(R.id.imageview);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_Start:                                //  播放
                if (mediaPlayer == null){           //  如果没有暂停
                    play();     //  调用 play 方法进行播放
                }else{
                    if (!mediaPlayer.isPlaying()){             //   如果处于暂停状态
                        int progress = seekBar.getProgress();   //  得到 SeekBar 的进度
                        int currentPosition = mediaPlayer.getCurrentPosition();     //  获取当前位置
                        continuePlay(progress,currentPosition);      //  在从暂停状态恢复播放时使用，除了继续播放音乐，还需要唤醒等待中的进度条绘制线程
                    }
                }
                break;
            case R.id.btn_Pause:                            //  暂停
                pause();
                break;
            case R.id.btn_Replay:                           //  停止
                if (mediaPlayer == null){          //   播放器对象还未创建或者已经销毁
                    play();
                }else{
                    if (!mediaPlayer.isPlaying()){      //  暂停状态
                        continuePlay(0,0);      //  进度条为0，第二个参数是：当前播放的位置，因为停止了，所以回到0
                    }else{                     //   正在播放状态不需要唤醒线程的操作，并且这种情况是点了一次停止以后再点停止就会变成播放的作用
                        mediaPlayer.seekTo(0);      //  从0开始播放
                        mediaPlayer.start();                //  开始播放
                    }
                }
                break;
            case R.id.btn_Stop:                             //  重播
                stop();                 //  这里重播相当于停止
                break;

        }
    }

    /*  线程用来根据音乐播放进度绘制进度条   */
    class SeekThread extends  Thread{
        int duration = mediaPlayer.getDuration();   //当前音乐总长度
        int currentPosition = 0;
        public void run(){
            while (isRun){
                currentPosition = mediaPlayer.getCurrentPosition(); //  获取当前音乐播放到了哪里
                seekBar.setProgress(currentPosition*100 / duration);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    while (suspended){
                        try {
                            obj.wait();     //  音乐暂停时让进度条线程也暂停
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /*  初始化播放，一个是音乐播放，一个线程控制的进度条绘制  */
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void play() {

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.img_zhuan);
        LinearInterpolator lin = new LinearInterpolator();//设置动画匀速运动
        animation.setInterpolator(lin);
        imageView.startAnimation(animation);

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.music);    //  直接理解为拿到音频资源文件就行
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {    //  监听播放结束事件（停止、暂停、播放完了一首音乐）
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (mediaPlayer != null){           //  如果是暂停的情况
                    stop();             //  调用暂停方法
                }
            }
        });
        isRun = true;                 //  进度条线程控制，ture为暂停进度条线程的绘制
        seekThread = new SeekThread();  //  实例化一个线程对象，开始发挥作用
        mediaPlayer.start();            //  开始播放音乐
        seekThread.start();             //  启动线程
    }

    private void stop() {
        imageView.clearAnimation();
        if (mediaPlayer != null){        //     只要有资源
            seekBar.setProgress(0);      //     进度条回到0的位置
            isRun = false;               //     线程
            mediaPlayer.stop();          //     停止播放音乐
            mediaPlayer.release();       //     释放资源
            mediaPlayer = null;          //     销毁音乐对象
            seekThread = null;           //     销毁线程
        }
    }

    private void pause() {
        imageView.clearAnimation();
        if (mediaPlayer != null && mediaPlayer.isPlaying()){    //  如果音乐对象是有资源 并且 音乐正在播放的状态下
            mediaPlayer.pause();         //     暂停
            suspended = true;           //  进度条线程等待状态控制
        }
    }

    //  在从暂停状态恢复播放时使用，除了继续播放音乐，还需要唤醒等待中的进度条绘制线程
    private void continuePlay(int progress, int currentPosition) {

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.img_zhuan);
        LinearInterpolator lin = new LinearInterpolator();//设置动画匀速运动
        animation.setInterpolator(lin);
        imageView.startAnimation(animation);

        mediaPlayer.seekTo(currentPosition);           //   跳转到对应时间进行播放
        mediaPlayer.start();                //  开始（暂停也是一种开始，跟播放一样，只是暂停是要回到之前的位置继续播放）
        seekBar.setProgress(progress);      //  设置回到之前的位置，这个progress是之前播放到的进度！
        suspended = false;               //  进度条线程等待状态控制
        synchronized (obj){           //  对象锁，播放线程暂停时，让进度条线程进入等待状态
            obj.notify();       //  唤醒线程，开始绘制进度条
        }
    }

}
