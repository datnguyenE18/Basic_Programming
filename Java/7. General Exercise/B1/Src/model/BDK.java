/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2.model;

import Bai2.controlller.ToObject;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nxulu
 */
public class BDK implements Serializable, ToObject{
    private MH m;
    private SinhVien sv;
    private String time;

    public BDK(MH m, SinhVien sv) {
        this.m = m;
        this.sv = sv;
      
        SimpleDateFormat f= new SimpleDateFormat("hh:mm:ss");
        Date d = new Date();
        this.time = f.format(d);
    }

    public MH getM() {
        return m;
    }

    public void setM(MH m) {
        this.m = m;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public Object[] toObject() {
        return new Object[]{
            sv.getMa(),
            sv.getTen(),
            m.getMa(),
            m.getTen(),
            time
        };
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
