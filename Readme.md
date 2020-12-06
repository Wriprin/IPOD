* [<strong>IPOD Development Directory</strong>](#ipod-development-doc)
* [&gt; Read Songs From Phone Part \- 1](#-read-songs-from-phone-part---1)
  * [commit the viewpagers and the style of tabindicator\.](#commit-the-viewpagers-and-the-style-of-tabindicator)
    * [1\. Download  the TabLayout\. ](#1-download--the-tablayouttip1-tip2)
    * [2\. <a href="https://blog\.csdn\.net/qq\_20785431/article/details/80865500" rel="nofollow">ViewPager</a>](#2-viewpager)
    * [3\. Viewpageradapter](#3-viewpageradapter)
    * [4\.  New songsFragment\.xml and albumFragment\.xml](#4--new-songsfragmentxml-and-albumfragmentxml)
    * [5\.  New tabindicator\.xml to initialize its style](#5--new-tabindicatorxml-to-initialize-its-style)
* [<strong>&gt; Read Songs From Phone Part \- 2</strong>](#-read-songs-from-phone-part---2)
  * [Add the permission of usage, fetch all the songs where from the storage to app\.](#add-the-permission-of-usage-fetch-all-the-songs-where-from-the-storage-to-app)
    * [1\. Add permission in MainActivity\.java](#1-add-permission-in-mainactivityjava)
    * [2\. Add permission in AndroidMainfest\.xml](#2-add-permission-in-androidmainfestxml)
    * [3\. Add onRequestPermissionsResult() in MainActivity\.java](#3-add-onrequestpermissionsresult-in-mainactivityjava)
    * [4\. New io\.wriprin\.android\.ipod\.MusicFiles\.java to pack attributes of songs](#4-new-iowriprinandroidipodmusicfilesjava-to-pack-attributes-of-songs)
    * [notice about the short key, Alt \+ Insert to generate the constructor and the Getter, Setter;](#notice-about-the-short-key-alt--insert-to-generate-the-constructor-and-the-getter-setter)
    * [5\. Add ArrayList  getAllAudio](#5-add-arraylist--getallaudio)
    * [6\. Global definition the MusicFiles to use it when user choose allow permission](#6-global-definition-the-musicfiles-to-use-it-when-user-choose-allow-permission)
* [<strong>&gt; Read Songs From Phone Part \- 3</strong>](#-read-songs-from-phone-part---3)
  * [Display SongList](#display-songlist)
    * [1\. New layout resource files \- music\_items\.xml to display the SongList](#1-new-layout-resource-files---music_itemsxml-to-display-the-songlist)
    * [2\. New io\.wriprin\.android\.ipod\.MusicAdapter\.java  collect the info](#2-new-iowriprinandroidipodmusicadapterjava--collect-the-info)
    * [3\. Import <a href="https://blog\.csdn\.net/xxdw1992/article/details/93624487?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160717011019724813279848%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160717011019724813279848&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~top\_click~default\-1\-93624487\.nonecase&amp;utm\_term=glide&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">Glide</a> dependency to build\.gradle (Module: app)](#3-import-glide-dependency-to-buildgradle-module-app)
    * [4\. songsFragment\.java \- recyclerview match Adapter](#4-songsfragmentjava---recyclerview-match-adapter)

* [<strong>&gt; Read Songs From Phone Part \- 4</strong>](#-read-songs-from-phone-part---4)

     * [Commit the layout of PlayerActivity](#commit-the-layout-of-playeractivity)

    * [1\. Add the Vector Assest which under drawable and change to a suitable color\.](#1-add-the-vector-assest-which-under-drawable-and-change-to-a-suitable-color)
    * [2\. New io\.wriprin\.android\.ipod\.PlayerActivity(EmptyActivity)](#2-new-iowriprinandroidipodplayeractivityemptyactivity)
    * [3\. New (Drawable Resource File ) \- main\_bg\.xml](#3-new-drawable-resource-file----main_bgxml)
    * [4\. New (Drawable Resource File ) \- gradient\.xml](#4-new-drawable-resource-file----gradientxml)
    * [5\. Add <a href="https://blog\.csdn\.net/gaolh89/article/details/79759404?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160721938819195271620070%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160721938819195271620070&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~top\_click~default\-2\-79759404\.pc\_search\_result\_no\_baidu\_js&amp;utm\_term=FloatingActionButton&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">FloatingActionButton</a> in activity\_player\.xml](#5-add-floatingactionbutton-in-activity_playerxml)

* [<strong>&gt; Read Songs From Phone Part \- 5 | PlayAudio</strong>](#-read-songs-from-phone-part---5--playaudio)
      * [Commit the FUNC of <a href="https://blog\.csdn\.net/kent\_todo/article/details/41943935?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160722044019725271027060%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160722044019725271027060&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~sobaiduend~default\-1\-41943935\.pc\_search\_result\_no\_baidu\_js&amp;utm\_term=itemview&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">itemview</a>\.click](#commit-the-func-of-itemviewclick)

    * [1\. Add itemview\.click in MusicAdapter\.java](#1-add-itemviewclick-in-musicadapterjava)
    * [2\. Add TimeLine's layout in activity\_player\.xml](#2-add-timelines-layout-in-activity_playerxml)
    * [3\. Implement the Init FUNC of PlayerActivity\.java](#3-implement-the-init-func-of-playeractivityjava)
    * [4\. MusicAdapter\.java to add <a href="https://blog\.csdn\.net/ching\_zhi/article/details/53842302?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160722165919195265193358%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160722165919195265193358&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~sobaiduend~default\-4\-53842302\.pc\_search\_result\_no\_baidu\_js&amp;utm\_term=putextra&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">intent\.putExtra()</a>](#4-musicadapterjava-to-add-intentputextra)
    * [5\. PlayerActivity\.java get the position from MusicAdapter\.java](#5-playeractivityjava-get-the-position-from-musicadapterjava)
    * [6\. Implement the method of playing](#6-implement-the-method-of-playing)
    * [7\. Implement the timeline\_Durationbar  and FortmattedTime](#7-implement-the-timeline_durationbar--and-fortmattedtime)

# **IPOD Development Doc**

# > Read Songs From Phone Part - 1   

- ### commit the viewpagers and the style of tabindicator.

#### 1. Download  the TabLayout.	[Tip1](https://www.jianshu.com/p/fde38f367019), [Tip2](https://www.cnblogs.com/duan-xue-bin/p/10059516.html)

```xml
<com.google.android.material.tabs.TabLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/colorPrimaryDark"
    android:id="@+id/tab_layout"
    app:tabIndicatorFullWidth="true"
    app:tabIndicatorGravity="center"
    app:tabTextColor="@color/colorAccent"
    app:tabIndicatorHeight="40dp"
    app:tabIndicatorColor="#009688"
    app:tabIndicator="@drawable/tab_indicator"/>
```

#### 2. [ViewPager](https://blog.csdn.net/qq_20785431/article/details/80865500)

```xml
<com.google.android.material.tabs.TabLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/colorPrimaryDark"
    android:id="@+id/tab_layout"
    app:tabIndicatorFullWidth="true"
    app:tabIndicatorGravity="center"
    app:tabTextColor="@color/colorAccent"
    app:tabIndicatorHeight="40dp"
    app:tabIndicatorColor="#009688"
    app:tabIndicator="@drawable/tab_indicator"/>
```

#### 3. Viewpageradapter  

```java
public static class ViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        this.fragments = new ArrayList<>();
        this.titles = new ArrayList<>();
    }

    void addFragments(Fragment fragment, String title){
        fragments.add(fragment);
        titles.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
```

#### 4.  New songsFragment.xml and albumFragment.xml

- ##### [RecyclerView](https://blog.csdn.net/weixin_43468667/article/details/89435098?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160715478319195283043122%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160715478319195283043122&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~baidu_landing_v2~default-6-89435098.nonecase&utm_term=recyclerview&spm=1018.2118.3001.4449)

#### 5.  New tabindicator.xml to initialize its style

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient android:centerColor="@color/colorPrimaryDark" android:angle="0"/>
</shape>
```



# **> Read Songs From Phone Part - 2**

- ### Add the permission of usage, fetch all the songs where from the storage to app.

#### 1. Add permission in MainActivity.java

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    permission();
}

private void permission() {
    if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)
        != PackageManager.PERMISSION_GRANTED)
    {
        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},REQUEST_CODE);
    }
    else
    {
        musicFiles = getAllAudio(this);
        initViewPager();
    }
}
```

#### 2. Add permission in AndroidMainfest.xml

```xml
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```

####  3. Add onRequestPermissionsResult() in MainActivity.java

```java
@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == REQUEST_CODE)
    {
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
        {
            //Do whatever you want permission related;
            musicFiles = getAllAudio(this);
            initViewPager();

        }
        else
        {
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},REQUEST_CODE);
        }
    }
}
```

#### 4. New io.wriprin.android.ipod.MusicFiles.java to pack attributes of songs 

- #### notice about the short key, Alt + Insert to generate the constructor and the Getter, Setter;

#### 5. Add ArrayList<Musicfiles>  getAllAudio  

```java
public ArrayList<MusicFiles> getAllAudio (Context context)
    {
            ArrayList<MusicFiles> tempAudioList = new ArrayList<>();
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            String[] projection =
            {
                MediaStore.Audio.Media.ALBUM,
                MediaStore.Audio.Media.TITLE,
                MediaStore.Audio.Media.DURATION,
                MediaStore.Audio.Media.DATA,    //for path
                MediaStore.Audio.Media.ARTIST,
                MediaStore.Audio.Media._ID

            };
            Cursor cursor = context.getContentResolver().query(uri,projection,null,null, order);
        	if (cursor != null)
        	{
            	while (cursor.moveToNext())
            	{
                    String album = cursor.getString(0);
                    String title = cursor.getString(1);
                    String duration = cursor.getString(2);
                    String path = cursor.getString(3);
                    String artist = cursor.getString(4);
                    String id = cursor.getString(5);

                    MusicFiles musicFiles = new MusicFiles(path, title, artist, album, duration, id);
                    //take log.e for check
                    Log.e("Path:" + path, "Album" + album);
                    tempAudioList.add(musicFiles);
                    if (!duplicate.contains(album)) {
                        albums.add(musicFiles);
                        duplicate.add(album);
                    }
                }
                cursor.close();
            }
            return tempAudioList;
    }
```

- [context.getContentResolver().query](https://blog.csdn.net/qqq3670279/article/details/51475899?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160715919119726885832985%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160715919119726885832985&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-2-51475899.nonecase&utm_term=getcontentresolver&spm=1018.2118.3001.4449)

#### 6. Global Declaration the MusicFiles to use it when user choose allow permission

# **> Read Songs From Phone Part - 3**

- ##### Display SongList

#### 1. New layout resource files - music_items.xml to display the SongList

#### 2. New io.wriprin.android.ipod.MusicAdapter.java  collect the info

- ##### [ViewHolder()](https://www.cnblogs.com/wugu-ren/p/6106379.html)

- ##### [Context()](https://blog.csdn.net/u013196348/article/details/94395205?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160716874619724839511869%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160716874619724839511869&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-3-94395205.nonecase&utm_term=context&spm=1018.2118.3001.4449)

- ##### [Adapter()](https://blog.csdn.net/fznpcy/article/details/8658155?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160716922219724818061062%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160716922219724818061062&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-8658155.nonecase&utm_term=adapter&spm=1018.2118.3001.4449)

- ##### [Inflater()](https://blog.csdn.net/qq_42376054/article/details/102509594?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160715644219721940212443%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160715644219721940212443&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-102509594.nonecase&utm_term=inflater&spm=1018.2118.3001.4449)

- ##### [byte[]](https://blog.csdn.net/bzlj2912009596/article/details/79146622?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160717113419724813259611%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160717113419724813259611&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-2-79146622.nonecase&utm_term=android%20byte&spm=1018.2118.3001.4449)

#### 3. Import [Glide](https://blog.csdn.net/xxdw1992/article/details/93624487?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160717011019724813279848%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160717011019724813279848&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-93624487.nonecase&utm_term=glide&spm=1018.2118.3001.4449) dependency to build.gradle (Module: app)

```gradle
//Glide
implementation 'com.github.bumptech.glide:glide:4.11.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
```

#### 4. songsFragment.java - recyclerview match Adapter

# **> Read Songs From Phone Part - 4**

- ##### Commit the layout of PlayerActivity

#### 1. Add the Vector Assest which under drawable and change to a suitable color.

![](http://cdn.jsdelivr.net/gh/Wriprin/Wriprin-Gallery/Gallery/VectorAssest.png)

#### 2. New io.wriprin.android.ipod.PlayerActivity(EmptyActivity)

#### 3. New (Drawable Resource File ) - main_bg.xml

- ##### RootElement is shape

#### 4. New (Drawable Resource File ) - gradient.xml

- ##### ImageView's [scaleType](https://blog.csdn.net/laoziyueguo3/article/details/48312347?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160721888519725271058745%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160721888519725271058745&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-3-48312347.pc_search_result_no_baidu_js&utm_term=scaletype&spm=1018.2118.3001.4449)

- ##### [ellipsize](https://blog.csdn.net/imdxt1986/article/details/6942743?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160721921819724838541780%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160721921819724838541780&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-6942743.pc_search_result_no_baidu_js&utm_term=ellipsize&spm=1018.2118.3001.4449)

#### 5. Add [FloatingActionButton](https://blog.csdn.net/gaolh89/article/details/79759404?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160721938819195271620070%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160721938819195271620070&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-2-79759404.pc_search_result_no_baidu_js&utm_term=FloatingActionButton&spm=1018.2118.3001.4449) in activity_player.xml

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:id="@+id/play_pause"
    android:src="@drawable/ic_play"
    android:layout_centerHorizontal="true"
    android:layout_centerVertical="true"
    android:focusable="true"
    android:clickable="true"/>
```

- ##### [why use focusable](https://blog.csdn.net/ckf1122/article/details/6269221?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control)

# **> Read Songs From Phone Part - 5 | PlayAudio**

- ##### Commit the FUNC of [itemview](https://blog.csdn.net/kent_todo/article/details/41943935?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160722044019725271027060%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160722044019725271027060&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-1-41943935.pc_search_result_no_baidu_js&utm_term=itemview&spm=1018.2118.3001.4449).click

#### 1. Add itemview.click in MusicAdapter.java

```java
holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(mContext, PlayerActivity.class);
        intent.putExtra("position",position);
        mContext.startActivity(intent);
    }
});
```

#### 2. Add TimeLine's layout in activity_player.xml

- ##### [SeekBar](https://blog.csdn.net/wu_kangjie/article/details/80145731?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160722074419195271695819%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160722074419195271695819&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-1-80145731.pc_search_result_no_baidu_js&utm_term=seekbar&spm=1018.2118.3001.4449)

#### 3. Implement the Init FUNC of PlayerActivity.java

- ##### Declare and assign

#### 4. MusicAdapter.java to add [intent.putExtra()](https://blog.csdn.net/ching_zhi/article/details/53842302?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160722165919195265193358%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160722165919195265193358&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-4-53842302.pc_search_result_no_baidu_js&utm_term=putextra&spm=1018.2118.3001.4449)

```java
intent.putExtra("position",position);
```

- ##### [position](https://www.cnblogs.com/vus520/archive/2011/08/30/2561932.html)

#### 5. PlayerActivity.java get the position from MusicAdapter.java

```java
position = getIntent().getIntExtra("position",-1);
```

- ##### [static](https://blog.csdn.net/guotianqing/article/details/79828100?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160722214719724838563346%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=160722214719724838563346&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-1-79828100.pc_search_result_no_baidu_js&utm_term=static%E5%85%B3%E9%94%AE%E5%AD%97%E7%9A%84%E4%BD%9C%E7%94%A8&spm=1018.2118.3001.4449)

#### 6. Implement the method of playing

```java
private void getIntentMethod() {
    position = getIntent().getIntExtra("position",-1);
    String sender = getIntent().getStringExtra("sender");
    if (sender != null && sender.equals("albumDetails"))
    {
        listSongs = albumFiles;
    }
    else
    {
        listSongs = mFiles;
    }
    if (listSongs != null)
    {
        playPauseBtn.setImageResource(R.drawable.ic_pause);
        uri = Uri.parse(listSongs.get(position).getPath());
    }
    if (mediaPlayer != null)
    {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
        mediaPlayer.start();
    }
    else
    {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
        mediaPlayer.start();
    }
    seekBar.setMax(mediaPlayer.getDuration() / 1000);
    metaData(uri);
}
```

- ##### [MediaPlayer](https://blog.csdn.net/zhaokx3/article/details/53432718?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160722327319724848150921%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=160722327319724848150921&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-7-53432718.pc_search_result_no_baidu_js&utm_term=mediaplayer&spm=1018.2118.3001.4449)

#### 7. Implement the timeline_Durationbar  and FortmattedTime 

- ##### [runOnUiThread](https://blog.csdn.net/cf8833/article/details/90297775?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160722366319724813238138%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=160722366319724813238138&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-4-90297775.pc_search_result_no_baidu_js&utm_term=runonuithread&spm=1018.2118.3001.4449) Thread collocate with [Handler](https://blog.csdn.net/wsq_tomato/article/details/80301851?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160722545519724847137907%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=160722545519724847137907&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-1-80301851.pc_search_result_no_baidu_js&utm_term=handler&spm=1018.2118.3001.4449)

