package com.example.zlr.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZLR on 2018/2/28.
 */

public class Forecast {

    @SerializedName("date")
    public String date;

    @SerializedName("tmp_max")
    public String  maxTemperature;

    @SerializedName("tmp_min")
    public String minTemperature;

    @SerializedName("cond_txt_d")
    public String ConditionData;

}
