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
public class NH implements Serializable{
    private int ma;
    private String ten;
    private int lai;

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

    public int getLai() {
        return lai;
    }

    public void setLai(int lai) {
        this.lai = lai;
    }

    public NH(int ma, String ten, int lai) {
        this.ma = ma;
        this.ten = ten;
        this.lai = lai;
    }
    public Object[] toO() {
        return new Object[] {ma,ten,lai};
    }
    
}
