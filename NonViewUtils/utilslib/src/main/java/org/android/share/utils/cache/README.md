# SpCache
A cache lib for SharedPreferences .


# Usage

When app start , init it .

```java
public class SpCacheApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        SpCache.init(this);
    }
}

```


Then , you can use freely ~~

*use SpCache.putXXX() and SpCache.getXXX()*

```java
SpCache.getInt(ACTIVITY_CREATE_COUNT, 0);
SpCache.putInt(ACTIVITY_CREATE_COUNT, 1);

```