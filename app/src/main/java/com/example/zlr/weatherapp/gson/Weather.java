package com.example.zlr.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZLR on 2018/2/28.
 */

public class Weather {

    public String status;

    public Basic basic;

    public Now now;

    @SerializedName("lifestyle")
    public  List<Suggestion> suggestionList;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}