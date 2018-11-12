package com.coolweather.gson;

import android.widget.Toast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mac on 2018/11/8.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
