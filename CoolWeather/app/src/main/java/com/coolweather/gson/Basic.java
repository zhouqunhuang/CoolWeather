package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mac on 2018/11/8.
 */

public class Basic {
    @SerializedName("city")//@SerializedName 表示让JSON字段和java字段之间建立映射。
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
