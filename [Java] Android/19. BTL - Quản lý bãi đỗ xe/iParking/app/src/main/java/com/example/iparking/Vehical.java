package com.example.iparking;

import java.util.HashMap;
import java.util.Map;

public class Vehical {
    public int time1;
    public String bienso1;
    public String hangxe1;
    public String timestart1;
    public String place1;

    public Vehical(){
    }

    public Vehical (String bienso1, String hangxe1, String timestart1, int time1, String place1){
        this.hangxe1 = hangxe1;
        this.bienso1 = bienso1;
        this.timestart1 = timestart1;
        this.time1 = time1;
        this.place1 = place1;
    }

    public int getTime1(){return time1;}

    public void setTime1(int time1){this.time1 = time1;}

    public String getHangxe1(){return hangxe1;}

    public void setHangxe1(String hangxe1){this.hangxe1 = hangxe1;}

    public String getTimestart1(){return timestart1;}

    public void setTimestart1(String timestart1){this.timestart1 = timestart1;}

    public String getBienso1(){return bienso1;}

    public void setBienso1(String bienso1){this.bienso1 = bienso1;}

    public String getPlace1(){return place1;}

    public void setPlace1(String place1){this.place1 = place1;}

    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        return result;
    }
}
