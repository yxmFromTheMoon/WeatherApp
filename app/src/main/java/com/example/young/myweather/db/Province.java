package com.example.young.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Young on 2018/4/9.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return this.id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
