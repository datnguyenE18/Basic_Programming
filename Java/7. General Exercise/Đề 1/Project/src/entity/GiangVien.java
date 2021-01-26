/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author 0
 */
public class GiangVien {
    private String ma, hoTen;
    int soGio, luongGiangVien;

    public GiangVien(String ma, String hoTen, int soGio) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.soGio = soGio;
//        this.luongGiangVien = luongGiangVien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    public int getLuongGiangVien() {
        return luongGiangVien;
    }

    public void setLuongGiangVien(int luongGiangVien) {
        this.luongGiangVien = luongGiangVien;
    }
    
    
}
