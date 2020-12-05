# IPOD Development Doc (EN)

## > Read Songs From Phone Part - 1   

- ### commit the viewpagers and the style of tabindicator.

### 1. download  the TabLayout.	[tip1](https://www.jianshu.com/p/fde38f367019), [tip2](https://www.cnblogs.com/duan-xue-bin/p/10059516.html)

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

### 2. [ViewPager](https://blog.csdn.net/qq_20785431/article/details/80865500)

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

### 3. viewpageradapter  

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

### 4.  create songsFragment.xml and albumFragment.xml

### 5.  create tabindicator.xml to initialize its style

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient android:centerColor="@color/colorPrimaryDark" android:angle="0"/>
</shape>
```



## > Read Songs From Phone Part - 2

- ### add the permission of usage, fetch all the songs where from the storage to app.

### 1. Add permission in MainActivity.java

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

### 2. Add permission in AndroidMainfest.xml

```xml
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```

###  3. Add onRequestPermissionsResult() in MainActivity.java

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

### 4. create io.wriprin.android.ipod.MusicFiles to pack attributes of songs 

- #### notice about the short key, Alt + Insert to generate the constructor and the Getter, Setter;

### 5. add ArrayList<Musicfiles>  getAllAudio  

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

### 6. Globally define the MusicFiles to use it when user choose allow permission



