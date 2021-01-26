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
    private String ten,dc,loai;

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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public KH(int ma, String ten, String dc, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.loai = loai;
    }
    public Object[] toO() {
        return new Object[] {ma,ten,dc,loai};
    }
    
}
