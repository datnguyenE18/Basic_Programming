package com.example.myapplication;

import androidx.annotation.NonNull;

public class ViTri {
    private int id;
    private String name;
    private String description;

    public ViTri() {
    }

    public ViTri(String name, String description) {
        this.name = name;
        this.description = description;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name:" +getName() + " \n" +"Description: "+getDescription();
    }
}
