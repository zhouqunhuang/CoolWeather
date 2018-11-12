package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mac on 2018/11/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
