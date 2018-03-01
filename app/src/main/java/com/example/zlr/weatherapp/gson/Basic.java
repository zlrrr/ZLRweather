package com.example.zlr.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZLR on 2018/2/28.
 */

public class Basic {

    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;
/*
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
    */
}
