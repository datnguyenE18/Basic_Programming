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
public class DS implements Serializable{
    private KH kh;
    private NH nh;
    private int tien;

    public KH getKh() {
        return kh;
    }

    public void setKh(KH kh) {
        this.kh = kh;
    }

    public NH getNh() {
        return nh;
    }

    public void setNh(NH nh) {
        this.nh = nh;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

    public DS(KH kh, NH nh, int tien) {
        this.kh = kh;
        this.nh = nh;
        this.tien = tien;
    }
    public Object[] toO() {
        return new Object[] {
            kh.getMa(),kh.getTen(),nh.getMa(),nh.getTen(),tien
        };
    }
    
    
}
