- [***Android-Allocation***](#android-allocation)
- [***wriprin***](#wriprin)
- [***DJG***](#djg)
- [***GF***](#gf)
- [***SWY***](#swy)
- [***YYJ***](#yyj)
- [***CCK***](#cck)


# ***Android-Allocation***

# ***wriprin***

> - ## **> Read Songs From Phone Part - 2**
>
>   - ### 获取权限
>
>   - ### GetAllAudio()
>
>   
>
> - ## **> Read Songs From Phone Part - 8 |  Shuffle, Repeat And Delete A File**
>
> 
>
> - ## > Read Songs From Phone Part - 9 | Album Fragment Part
>
>   - ### Commit the layout of Album and tied to the songs
>
>   
>
> - ## > Read Songs From Phone Part - 12 | Search Files Filter List
>





------



# ***DJG***

> - ### 显示歌曲列表。
>
>   - ## **> Read Songs From Phone Part - 3**
>
>     - #### Display SongList
>
>     ### 1. New layout resource files - music_items.xml to display the SongList
>
>     ### 2. New io.wriprin.android.ipod.MusicAdapter.java  collect the info
>
>     - #### [ViewHolder()](https://www.cnblogs.com/wugu-ren/p/6106379.html)
>
>     - #### [Context()](https://blog.csdn.net/u013196348/article/details/94395205?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160716874619724839511869%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160716874619724839511869&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-3-94395205.nonecase&utm_term=context&spm=1018.2118.3001.4449)
>
>     - #### [Adapter()](https://blog.csdn.net/fznpcy/article/details/8658155?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160716922219724818061062%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160716922219724818061062&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-8658155.nonecase&utm_term=adapter&spm=1018.2118.3001.4449)
>
>     - #### [Inflater()](https://blog.csdn.net/qq_42376054/article/details/102509594?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160715644219721940212443%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160715644219721940212443&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-102509594.nonecase&utm_term=inflater&spm=1018.2118.3001.4449)
>
>     - #### [byte[]](https://blog.csdn.net/bzlj2912009596/article/details/79146622?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160717113419724813259611%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160717113419724813259611&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-2-79146622.nonecase&utm_term=android%20byte&spm=1018.2118.3001.4449)
>
>     ### 3. Import [Glide](https://blog.csdn.net/xxdw1992/article/details/93624487?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160717011019724813279848%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160717011019724813279848&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-93624487.nonecase&utm_term=glide&spm=1018.2118.3001.4449) dependency to build.gradle (Module: app)
>
>     ```gradle
>     //Glide
>     implementation 'com.github.bumptech.glide:glide:4.11.0'
>     annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
>     ```
>
>     ### 4. songsFragment.java - recyclerview match Adapter
>
>     
>
> - ## 实现音乐集内歌曲的播放。
>
>   - ## > Read Songs From Phone Part - 11 | Play Album Files
>
>     - #### Play the songs in Ablum list.
>
>     ### 1. When click the songs, JMP to the PlayerActivity.java
>
>     ```java
>     holder.itemView.setOnClickListener(new View.OnClickListener() {
>         @Override
>         public void onClick(View view) {
>             Intent intent = new Intent(mContext, PlayerActivity.class);
>             intent.putExtra("sender", "albumDetails");
>             intent.putExtra("position", position);
>             mContext.startActivity(intent);
>         }
>     });
>     ```
>
>     
>
>     ### 2. Get Intent in PlayerActivity.java
>
>     ```java
>     String sender = getIntent().getStringExtra("sender");
>     if (sender != null && sender.equals("albumDetails"))
>     {
>         listSongs = albumFiles;
>     }
>     else
>     {
>         listSongs = mFiles;
>     }
>     ```
>
>
> 
>
> 
>
> - ## 用户注册登录及个人信息填写。



------



# ***GF***

> - ## **提交歌曲播放页面的布局，VectorAssest的使用。**
>
>   - ## **> Read Songs From Phone Part - 4**
>
>     - ### 1. Add the Vector Assest which under drawable and change to a suitable color.
>
>       ![](http://cdn.jsdelivr.net/gh/Wriprin/Wriprin-Gallery/Gallery/VectorAssest.png)
>
>       ### 2. New io.wriprin.android.ipod.PlayerActivity(EmptyActivity)
>
>       ### 3. New (Drawable Resource File ) - main_bg.xml
>
>       - #### RootElement is shape
>
>       ### 4. New (Drawable Resource File ) - gradient.xml
>
>       - #### ImageView's [scaleType](https://blog.csdn.net/laoziyueguo3/article/details/48312347?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160721888519725271058745%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160721888519725271058745&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-3-48312347.pc_search_result_no_baidu_js&utm_term=scaletype&spm=1018.2118.3001.4449)
>
>       - #### [ellipsize](https://blog.csdn.net/imdxt1986/article/details/6942743?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160721921819724838541780%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160721921819724838541780&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-6942743.pc_search_result_no_baidu_js&utm_term=ellipsize&spm=1018.2118.3001.4449)
>
>       ### 5. Add [FloatingActionButton](https://blog.csdn.net/gaolh89/article/details/79759404?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160721938819195271620070%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160721938819195271620070&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-2-79759404.pc_search_result_no_baidu_js&utm_term=FloatingActionButton&spm=1018.2118.3001.4449) in activity_player.xml
>
>       ```xml
>       <com.google.android.material.floatingactionbutton.FloatingActionButton
>           android:layout_width="wrap_content"
>           android:layout_height="wrap_content"
>           android:id="@+id/play_pause"
>           android:src="@drawable/ic_play"
>           android:layout_centerHorizontal="true"
>           android:layout_centerVertical="true"
>           android:focusable="true"
>           android:clickable="true"/>
>       ```
>
>       - #### [why use focusable](https://blog.csdn.net/ckf1122/article/details/6269221?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control)



------



# ***SWY***

> - ## 实现歌曲渐入渐出效果，当歌曲结束时自动播放下一首歌曲。
>
> - ## **> Read Songs From Phone Part - 7 | Animation APP**
>
>   - #### implement the animation of song_fading out and in, autoplay the next_song when current_song is done.
>
>   ### 1. Add the ImageAnimation()
>
>   ```java
>   //the animation of songs_changing
>   public void ImageAnimation(final Context context, final ImageView imageView, final Bitmap bitmap)
>   {
>       Animation animOut = AnimationUtils.loadAnimation(context, android.R.anim.fade_out);
>       final Animation animIn = AnimationUtils.loadAnimation(context, android.R.anim.fade_in);
>       animOut.setAnimationListener(new Animation.AnimationListener() {
>           @Override
>           public void onAnimationStart(Animation animation) {
>   
>           }
>   
>           @Override
>           public void onAnimationEnd(Animation animation) {
>               Glide.with(context).load(bitmap).into(imageView);
>               animIn.setAnimationListener(new Animation.AnimationListener() {
>                   @Override
>                   public void onAnimationStart(Animation animation) {
>   
>                   }
>   
>                   @Override
>                   public void onAnimationEnd(Animation animation) {
>   
>                   }
>   
>                   @Override
>                   public void onAnimationRepeat(Animation animation) {
>   
>                   }
>               });
>               imageView.startAnimation(animIn);
>           }
>   
>           @Override
>           public void onAnimationRepeat(Animation animation) {
>   
>           }
>       });
>       imageView.startAnimation(animOut);
>   }
>   ```
>
>   ### 2. Implement MediaPlayer.OnCompletionListener in PlayerActivity.java
>
>   ```java
>   public class PlayerActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener{
>   ```
>
>   ### 3. Implement the method for the FUNC of autoplay
>
>   ```java
>   @Override
>   public void onCompletion(MediaPlayer mp) {
>       nextBtnClicked();
>       if (mediaPlayer != null)
>       {
>           mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
>           mediaPlayer.start();
>           mediaPlayer.setOnCompletionListener(this);
>       }
>   }
>   ```
>





------



# ***YYJ***

> - ### 初始页面设计。
>
>   - ## > Read Songs From Phone Part - 1   
>
>     - #### commit the viewpagers and the style of tabindicator.
>
>     ### 1. Download  the TabLayout.	[Tip1](https://www.jianshu.com/p/fde38f367019), [Tip2](https://www.cnblogs.com/duan-xue-bin/p/10059516.html)
>
>     ```xml
>     <com.google.android.material.tabs.TabLayout
>         android:layout_width="match_parent"
>         android:layout_height="wrap_content"
>         android:background="@color/colorPrimaryDark"
>         android:id="@+id/tab_layout"
>         app:tabIndicatorFullWidth="true"
>         app:tabIndicatorGravity="center"
>         app:tabTextColor="@color/colorAccent"
>         app:tabIndicatorHeight="40dp"
>         app:tabIndicatorColor="#009688"
>         app:tabIndicator="@drawable/tab_indicator"/>
>     ```
>
>     ### 2. [ViewPager](https://blog.csdn.net/qq_20785431/article/details/80865500)
>
>     ```xml
>     <com.google.android.material.tabs.TabLayout
>         android:layout_width="match_parent"
>         android:layout_height="wrap_content"
>         android:background="@color/colorPrimaryDark"
>         android:id="@+id/tab_layout"
>         app:tabIndicatorFullWidth="true"
>         app:tabIndicatorGravity="center"
>         app:tabTextColor="@color/colorAccent"
>         app:tabIndicatorHeight="40dp"
>         app:tabIndicatorColor="#009688"
>         app:tabIndicator="@drawable/tab_indicator"/>
>     ```
>
>     ### 3. Viewpageradapter  
>
>     ```java
>     public static class ViewPagerAdapter extends FragmentPagerAdapter {
>         private ArrayList<Fragment> fragments;
>         private ArrayList<String> titles;
>     
>     
>         public ViewPagerAdapter(@NonNull FragmentManager fm) {
>             super(fm);
>             this.fragments = new ArrayList<>();
>             this.titles = new ArrayList<>();
>         }
>     
>         void addFragments(Fragment fragment, String title){
>             fragments.add(fragment);
>             titles.add(title);
>         }
>     
>         @NonNull
>         @Override
>         public Fragment getItem(int position) {
>             return fragments.get(position);
>         }
>     
>         @Override
>         public int getCount() {
>             return fragments.size();
>         }
>     
>         @Nullable
>         @Override
>         public CharSequence getPageTitle(int position) {
>             return titles.get(position);
>         }
>     }
>     ```
>
>     ### 4.  New songsFragment.xml and albumFragment.xml
>
>     - #### [RecyclerView](https://blog.csdn.net/weixin_43468667/article/details/89435098?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160715478319195283043122%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160715478319195283043122&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~baidu_landing_v2~default-6-89435098.nonecase&utm_term=recyclerview&spm=1018.2118.3001.4449)
>
>     ### 5.  New tabindicator.xml to initialize its style
>
>     ```xml
>     <?xml version="1.0" encoding="utf-8"?>
>     <shape xmlns:android="http://schemas.android.com/apk/res/android">
>         <gradient android:centerColor="@color/colorPrimaryDark" android:angle="0"/>
>     </shape>
>     ```
>





------



# ***CCK***

> - ## 将歌曲添加到音乐集中。
>
>   - ## > Read Songs From Phone Part - 10 | Album Fragment Details
>
>     - #### commit the FUNC of Album JMP its fragment.
>
>     ### 1. New AlbumDetails.java  ==>  ***(Activity)***
>
>     ### 2. Design activity_album_details.xml
>
>     ### 3. Implement  the FUNC of Album JMP its fragment (activity_album_details.xml)
>
>     ```java
>     holder.itemView.setOnClickListener(new View.OnClickListener() {
>         @Override
>         public void onClick(View view) {
>             Intent intent = new Intent(mContext, AlbumDetails.class);
>             intent.putExtra("albumName", albumFiles.get(position).getAlbum());
>             mContext.startActivity(intent);
>         }
>     });
>     ```
>
>     
>
>     - ####  Display songs' own albumPhoto.
>
>     ```java
>     @Override
>     protected void onCreate(Bundle savedInstanceState) {
>         super.onCreate(savedInstanceState);
>         setContentView(R.layout.activity_album_details);
>         recyclerView = findViewById(R.id.recyclerView);
>         albumPhoto = findViewById(R.id.albumPhoto);
>         albumName = getIntent().getStringExtra("albumName");
>         int j = 0;
>         for (int i = 0 ; i < musicFiles.size() ; i ++)
>         {
>             if (albumName.equals(musicFiles.get(i).getAlbum()))
>             {
>                 albumSongs.add(j, musicFiles.get(i));
>                 j ++;
>             }
>         }
>         byte[] image = getAlbumArt(albumSongs.get(0).getPath());
>         if (image != null)
>         {
>             Glide.with(this)
>                     .load(image)
>                     .into(albumPhoto);
>         }
>         else
>         {
>             Glide.with(this)
>                     .load(R.drawable.bewedoc)
>                     .into(albumPhoto);
>         }
>     
>     }
>     ```
>
>     
>
>     - #### Show the songs which is belong to the specific Album.
>
>     ### 1.  New AlbumDetailsAdapter.java
>
>     > ##### copy AlbumAdapter.java to AlbumDetailsAdapter.java
>
>     ### 2. Ctrl + O: Implement onResume()
>
>     ```java
>     @Override
>     protected void onResume() {
>         super.onResume();
>         if (!(albumSongs.size() < 1))
>         {
>             albumDetailsAdapter = new AlbumDetailsAdapter(this, albumSongs);
>             recyclerView.setAdapter(albumDetailsAdapter);
>             recyclerView.setLayoutManager(new LinearLayoutManager(this,
>                     RecyclerView.VERTICAL, false));
>         }
>     }
>     ```
>
>     