package com.example.onthi1.model;

public class CongViec {
    private int id;
    private int idNV;
    private int idVT;
    private String time;
    private String mota;

    public CongViec(int id, int idNV, int idVT, String time, String mota) {
        this.id = id;
        this.idNV = idNV;
        this.idVT = idVT;
        this.time = time;
        this.mota = mota;
    }

    public CongViec(int idNV, int idVT, String time, String mota) {
        this.idNV = idNV;
        this.idVT = idVT;
        this.time = time;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    public int getIdVT() {
        return idVT;
    }

    public void setIdVT(int idVT) {
        this.idVT = idVT;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
