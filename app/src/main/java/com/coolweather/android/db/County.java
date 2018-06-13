package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/12.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherid;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherid;
    }
    public void setWeatherId(String weatherid){
        this.weatherid=weatherid;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
