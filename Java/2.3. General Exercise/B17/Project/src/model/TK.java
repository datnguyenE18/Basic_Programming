/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0
 */
public class TK implements Serializable{
    private KH kh;
    private List<DS> list;

    public TK(KH kh) {
        this.kh = kh;
        list=  new ArrayList<>();
    }

    public KH getKh() {
        return kh;
    }

    public void setKh(KH kh) {
        this.kh = kh;
    }

    public List<DS> getList() {
        return list;
    }

    public void setList(List<DS> list) {
        this.list = list;
    }
    
    public Object[] toO() {
        int tien = 0;
        for(DS x: list) {
            tien += x.getTien();
        }
        return new Object[] {
            kh.getMa(),kh.getTen(),tien
        };
    }
    
    
}
