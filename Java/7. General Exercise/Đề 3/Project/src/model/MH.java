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
public class MH implements Serializable{
    private int ma;
    private String ten,nhom;
    private int gia;

    public MH(int ma, String ten, String nhom, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public Object[] toO() {
        return new Object[] {
            ma,ten,nhom,gia
        };
    }
    
}
