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
public class GVCoHuu extends GiangVien implements TinhLuong{
    private int soGioDM;

    public GVCoHuu(int soGioDM, String ma, String hoTen, int soGio) {
        super(ma, hoTen, soGio);
        this.soGioDM = soGioDM;
        this.luongGiangVien = getLuong();
    }

    @Override
    public String toString() {
        return "GVCH: " + getMa() + "\t" + getHoTen() + "\t" + getSoGio() + "\t" + soGioDM + "\t" + getLuongGiangVien();
    }
    
    

    public int getSoGioDM() {
        return soGioDM;
    }

    public void setSoGioDM(int soGioDM) {
        this.soGioDM = soGioDM;
    }

    
    
    @Override
    public int getLuong() {
        int sum = soGioDM * 140 + (getSoGio() - soGio) * 50;
        return sum;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
