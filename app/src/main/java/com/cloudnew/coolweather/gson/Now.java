package com.cloudnew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cloud on 2017/11/23.
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
