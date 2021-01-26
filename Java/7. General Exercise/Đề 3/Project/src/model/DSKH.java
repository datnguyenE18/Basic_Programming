/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 0
 */
public class DSKH implements Serializable{
    private KH kh;
    private MH mh;
    private int solg;

    public DSKH(KH kh, MH mh, int solg) {
        this.kh = kh;
        this.mh = mh;
        this.solg = solg;
    }

    public KH getKh() {
        return kh;
    }

    public void setKh(KH kh) {
        this.kh = kh;
    }

    public MH getMh() {
        return mh;
    }

    public void setMh(MH mh) {
        this.mh = mh;
    }

    public int getSolg() {
        return solg;
    }

    public void setSolg(int solg) {
        this.solg = solg;
    }

  
    public Object[] toO(){
        return new Object[] {
            mh.getMa(),mh.getTen(),kh.getMa(),kh.getTen(),solg
            
        };
    }
    
}
