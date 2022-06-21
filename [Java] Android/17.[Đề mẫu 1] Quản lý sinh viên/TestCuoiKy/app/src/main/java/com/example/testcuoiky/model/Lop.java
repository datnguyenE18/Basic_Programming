package com.example.testcuoiky.model;

public class Lop {
    private int maLop;
    private String tenLop;
    private String mota;
    private String danhsachsinhvien;

    public Lop(int maLop, String tenLop, String mota,String danhsachsinhvien) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.mota = mota;
        this.danhsachsinhvien = danhsachsinhvien;
    }

    public String getDanhsachsinhvien() {
        return danhsachsinhvien;
    }

    public void setDanhsachsinhvien(String danhsachsinhvien) {
        this.danhsachsinhvien = danhsachsinhvien;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
