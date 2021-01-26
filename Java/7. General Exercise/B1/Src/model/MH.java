/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2.model;

import java.io.Serializable;

/**
 *
 * @author nxulu
 */
public class MH implements Serializable{
    private int ma;
    private String ten;
    private int sl;
    private String loai;

    public MH(int ma, String ten, int sl, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.loai = loai;
    }

    public MH(int i, String ten, String nhom, float parseFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
   public Object[] toO() {
       return new Object[]{
           ma,
           ten,
           sl,
           loai
       };
   }
}
