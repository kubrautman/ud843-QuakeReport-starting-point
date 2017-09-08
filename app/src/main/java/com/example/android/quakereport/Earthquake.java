package com.example.android.quakereport;

/**
 * Created by kub on 31.08.2017.
 */

public class Earthquake {
    private long mTimeInMilliseconds;
    private  String mMagnitude;
    private  String mLocation;

    public  Earthquake(String magnitude,String location,long timeInMilliseconds){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }
}
