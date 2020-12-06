* [<strong>IPOD Development Doc</strong>](#ipod-development-doc)
* [&gt; Read Songs From Phone Part \- 1](#-read-songs-from-phone-part---1)
  * [commit the viewpagers and the style of tabindicator\.](#commit-the-viewpagers-and-the-style-of-tabindicator)
    * [1\. Download  the TabLayout\.  <a href="https://www\.jianshu\.com/p/fde38f367019" rel="nofollow">Tip1</a>, <a href="https://www\.cnblogs\.com/duan\-xue\-bin/p/10059516\.html" rel="nofollow">Tip2</a>](#1-download--the-tablayouttip1-tip2)
    * [2\. <a href="https://blog\.csdn\.net/qq\_20785431/article/details/80865500" rel="nofollow">ViewPager</a>](#2-viewpager)
    * [3\. Viewpageradapter](#3-viewpageradapter)
    * [4\.  New songsFragment\.xml and albumFragment\.xml](#4--new-songsfragmentxml-and-albumfragmentxml)
      * [<a href="https://blog\.csdn\.net/weixin\_43468667/article/details/89435098?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160715478319195283043122%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160715478319195283043122&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~baidu\_landing\_v2~default\-6\-89435098\.nonecase&amp;utm\_term=recyclerview&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">RecyclerView</a>](#recyclerview)
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
      * [<a href="https://www\.cnblogs\.com/wugu\-ren/p/6106379\.html" rel="nofollow">ViewHolder()</a>](#viewholder)
      * [<a href="https://blog\.csdn\.net/u013196348/article/details/94395205?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160716874619724839511869%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160716874619724839511869&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~top\_click~default\-3\-94395205\.nonecase&amp;utm\_term=context&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">Context()</a>](#context)
      * [<a href="https://blog\.csdn\.net/fznpcy/article/details/8658155?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160716922219724818061062%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160716922219724818061062&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~top\_click~default\-1\-8658155\.nonecase&amp;utm\_term=adapter&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">Adapter()</a>](#adapter)
      * [<a href="https://blog\.csdn\.net/qq\_42376054/article/details/102509594?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160715644219721940212443%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160715644219721940212443&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~top\_click~default\-1\-102509594\.nonecase&amp;utm\_term=inflater&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">Inflater()</a>](#inflater)
      * [<a href="https://blog\.csdn\.net/bzlj2912009596/article/details/79146622?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160717113419724813259611%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160717113419724813259611&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~sobaiduend~default\-2\-79146622\.nonecase&amp;utm\_term=android%20byte&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">byte[]</a>](#byte)
    * [3\. Import <a href="https://blog\.csdn\.net/xxdw1992/article/details/93624487?ops\_request\_misc=%257B%2522request%255Fid%2522%253A%2522160717011019724813279848%2522%252C%2522scm%2522%253A%252220140713\.130102334\.\.%2522%257D&amp;request\_id=160717011019724813279848&amp;biz\_id=0&amp;utm\_medium=distribute\.pc\_search\_result\.none\-task\-blog\-2~all~top\_click~default\-1\-93624487\.nonecase&amp;utm\_term=glide&amp;spm=1018\.2118\.3001\.4449" rel="nofollow">Glide</a> dependency to build\.gradle (Module: app)](#3-import-glide-dependency-to-buildgradle-module-app)
    * [4\. songsFragment\.java \- recyclerview match Adapter](#4-songsfragmentjava---recyclerview-match-adapter)

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

#### 6. Global definition the MusicFiles to use it when user choose allow permission

# **> Read Songs From Phone Part - 3**

- ### Display SongList

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





