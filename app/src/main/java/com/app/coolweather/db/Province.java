package com.app.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;//记录省的名字
    private int provinceCode;//记录省的代号
    public int getId(){
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setId(int id){
        this.id = id;

    }
    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;

    }
    public void getProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

}
