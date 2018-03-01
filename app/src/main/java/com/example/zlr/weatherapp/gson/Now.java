package com.example.zlr.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZLR on 2018/2/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String info;
}
