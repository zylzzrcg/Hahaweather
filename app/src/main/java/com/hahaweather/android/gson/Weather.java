package com.hahaweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by V on 2017-12-24.
 */

public class Weather {

    public String status;

    public AQI aqi;

    public Basic basic;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
