/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author 0
 */
public class GVTGiang extends GiangVien implements TinhLuong{
    int heSo;

    public GVTGiang(int heSo, String ma, String hoTen, int soGio) {
        super(ma, hoTen, soGio);
        this.heSo = heSo;
        this.luongGiangVien = getLuong();
    }

    @Override
    public String toString() {
        return "GVTG: " + getMa() + "\t" + getHoTen() + "\t" + getSoGio() + "\t" + getHeSo() + "\t" + getLuongGiangVien();    }
    
    

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    

    @Override
    public int getLuong() {
        int sum = getSoGio() * heSo * 50;
        return sum;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
