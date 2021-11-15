/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.GVCoHuu;
import entity.GVTGiang;
import entity.GiangVien;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author 0
 */
public class QLGD implements ChucNang{
    private List<GiangVien> list;
    Scanner in;
    public QLGD() {
        list = new ArrayList<>();
        in = new Scanner(System.in);
        list.add(new GVCoHuu(10, "abc", "Trinh xuan Luong", 43));
        list.add(new GVCoHuu(15, "ebc2", "Binh gold", 10));
        list.add(new GVTGiang(10, "abc", "Nguyen Xuan Luu", 30));
        list.add(new GVCoHuu(20, "abc", "Sofm", 10));
    }

    private boolean tim(String ma) {
         for(GiangVien i:list) {
//            System.out.println(i);
            if (ma.equalsIgnoreCase(i.getMa())) return true;
         }
         
        return false;
    }
    
    private GiangVien nhap() {
        String ma=null;
        String hoTen =null;
        while (true) {
            System.out.print("Nhap ma: ");
            ma = in.nextLine();
            System.out.print("Nhap h1o, ten: ");
            hoTen = in.nextLine();
            if (!tim(ma) && hoTen.matches("^[A-Za-z\\s]+")) {
                break;
            }
            System.out.println("Nhap lai!!!");
        }
      
        System.out.print("Nhap so gio trong thang: ");
        int soGio = Integer.parseInt(in.nextLine());
        return new GiangVien(ma, hoTen, soGio);
    }
    
    @Override
    public void nhapCH() {
        System.out.println("Nhap giang vien co huu");
        GiangVien tmp = nhap();
        System.out.print("Nhap so gio dinh muc: ");
        int soGioDM = Integer.parseInt(in.nextLine());
        list.add(new GVCoHuu(soGioDM, tmp.getMa(), tmp.getHoTen(), tmp.getSoGio()));
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nhapTG() {
        System.out.println("Nhap giang vien thinh giang");
        GiangVien tmp = nhap();
        System.out.print("Nhap he so: ");
        int heSo = Integer.parseInt(in.nextLine());
        list.add(new GVTGiang(heSo, tmp.getMa(), tmp.getHoTen(), tmp.getSoGio()));
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void in() {
        for(GiangVien i:list) {
            System.out.println(i);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma can sua: ");
        String ma = in.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (ma.equalsIgnoreCase(list.get(i).getMa())) {
                 System.out.println("Nhap cac thuoc tinh can sua: ");
                System.out.print("Nhap ho, ten: ");
                String hoTen = in.nextLine();
                System.out.print("Nhap so gio trong thang: ");
                int soGio = Integer.parseInt(in.nextLine());
                list.get(i).setHoTen(hoTen);
                list.get(i).setSoGio(soGio);
                return;
            }
        }
        
       
            System.out.println("Ma khong ton tai");
      
       
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tk() {
        System.out.println("Nhap khoang luong can tim kiem (tu a->b): ");
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        for (int i = 0; i < list.size(); i++) {
            int luong = list.get(i).getLuongGiangVien();
            if (luong >= a && luong <= b) {
                System.out.println(list.get(i));
            }
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void thongKe() {
        List<GVCoHuu> tmp = new ArrayList<>();
        for(GiangVien i: list) {
            if (i instanceof GVCoHuu) {
                tmp.add((GVCoHuu) i);
            }
        }
        Map<Integer, Long> count = tmp.stream().collect(Collectors.groupingBy(GVCoHuu::getSoGioDM, Collectors.counting()));
        System.out.println(count);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
