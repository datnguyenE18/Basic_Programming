package iofile;

import java.io.Serializable;

public class SinhVien implements Serializable {

    private String name; // tên 
    private String code; // mã sv
    private int team; // nhóm

    public SinhVien(String name, String code, int team) {
        this.name = name;
        this.code = code;
        this.team = team;
    }

    public SinhVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public Object[] toObject() { // Gom dữ liệu thành một object rồi gửi đi
        return new Object[]{
            name, code, team
        };
    }
}
