package com.example.testcuoiky.model;

public class SinhVien {
    private  int masinhvien;
    private  String tensinhvien;
    private String ngaysinh;
    private String quequan;
    private String namhoc;

    public SinhVien(int masinhvien, String tensinhvien, String ngaysinh, String quequan, String namhoc) {
        this.masinhvien = masinhvien;
        this.tensinhvien = tensinhvien;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.namhoc = namhoc;
    }

    public int getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(int masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getTensinhvien() {
        return tensinhvien;
    }

    public void setTensinhvien(String tensinhvien) {
        this.tensinhvien = tensinhvien;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(String namhoc) {
        this.namhoc = namhoc;
    }
}
