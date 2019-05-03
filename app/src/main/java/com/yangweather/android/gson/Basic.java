package com.yangweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15110 on 2019/4/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
