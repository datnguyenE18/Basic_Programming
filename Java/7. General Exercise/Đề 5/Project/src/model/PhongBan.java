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
public class PhongBan implements Serializable{
    private int ma;
    private String ten,mota;
    private double heSo;

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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    
    public PhongBan(int ma, String ten, String mota, double heSo) {
        this.ma = ma;
        this.ten = ten;
        this.mota = mota;
        this.heSo = heSo;
    }

   
     
    public Object[] toO() {
        return new Object[] {
            ma,ten,mota,heSo
        };
    }
    
}

