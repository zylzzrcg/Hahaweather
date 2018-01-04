package com.hahaweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by V on 2017-12-24.
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
