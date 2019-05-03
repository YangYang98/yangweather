package com.yangweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15110 on 2019/4/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
        @SerializedName("qlty")
        public String airQuality;
    }
}
