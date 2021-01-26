/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nxulu
 */
public class Lop {
    List<SinhVien> sv;
    MH m;
    int sl;

    public List<SinhVien> getSv() {
        return sv;
    }

    public void setSv(List<SinhVien> sv) {
        this.sv = sv;
    }

    public MH getM() {
        return m;
    }

    public void setM(MH m) {
        this.m = m;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public Lop(MH m) {
        sv = new ArrayList<>();
        this.m = m;
        this.sl = 0;
    }
    public void themSv(SinhVien s) {
        if (sl > 30) return;
        sv.add(s);
        ++sl;
    }
    
    public Object[] toO() {
        return new Object[]{
            m.getMa(),
            m.getTen(),
            sl
        };
    }
    
}
