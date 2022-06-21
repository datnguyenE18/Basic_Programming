package com.example.myapplication;

import androidx.annotation.NonNull;

public class NhanVien {
    private int id;
    private String name;
    private String year;
    private String quequan;
    private String degree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public NhanVien() {
    }

    public NhanVien(String name, String year, String quequan, String degree) {
        this.name = name;
        this.year = year;
        this.quequan = quequan;
        this.degree = degree;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name:" +getName() + " \n" +"Nam sinh: "+getYear() +"\n" +
                "Que quan:" +getQuequan() + " \n" +"Trinh do: "+getDegree();
    }
}
