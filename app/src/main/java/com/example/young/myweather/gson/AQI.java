package com.example.young.myweather.gson;

/**
 * Created by Young on 2018/4/9.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
