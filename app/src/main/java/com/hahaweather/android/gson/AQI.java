package com.hahaweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by V on 2017-12-24.
 */

public class AQI {

    public AQICity city;


    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
