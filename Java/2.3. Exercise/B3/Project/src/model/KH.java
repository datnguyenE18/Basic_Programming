/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 0
 */
public class KH implements Serializable{
    private int ma;
    private String ten,dc,dt;

    public KH(int ma, String ten, String dc, String dt) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.dt = dt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
     public Object[] toO() {
        return new Object[] {
            ma,ten,dc,dt
        };
    }
    
}
