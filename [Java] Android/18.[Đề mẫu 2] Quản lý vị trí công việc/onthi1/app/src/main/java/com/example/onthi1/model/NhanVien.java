package com.example.onthi1.model;

public class NhanVien {
    private int id, namSinh;
    private String ten,que,trinhdo;

    public NhanVien() {
    }

    public NhanVien(int id, int namSinh, String ten, String que, String trinhdo) {
        this.id = id;
        this.namSinh = namSinh;
        this.ten = ten;
        this.que = que;
        this.trinhdo = trinhdo;
    }

    public NhanVien(int namSinh, String ten, String que, String trinhdo) {
        this.namSinh = namSinh;
        this.ten = ten;
        this.que = que;
        this.trinhdo = trinhdo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
}
