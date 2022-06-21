package com.example.testcuoiky.model;

public class SinhVienTheoLop {
    private int  masinhvien;
    private int  lop;
    private String kyhoc;
    private int sotinchi;

    public SinhVienTheoLop(int masinhvien, int lop, String kyhoc, int sotinchi) {
        this.masinhvien = masinhvien;
        this.lop = lop;
        this.kyhoc = kyhoc;
        this.sotinchi = sotinchi;
    }

    public int getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(int masinhvien) {
        this.masinhvien = masinhvien;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public String getKyhoc() {
        return kyhoc;
    }

    public void setKyhoc(String kyhoc) {
        this.kyhoc = kyhoc;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }
}
