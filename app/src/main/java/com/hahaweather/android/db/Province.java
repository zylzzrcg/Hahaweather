package com.hahaweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by V on 2017/12/13.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
