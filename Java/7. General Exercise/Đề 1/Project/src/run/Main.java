/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import model.QLGD;

/**
 *
 * @author 0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLGD q = new QLGD();
        while (true) {
            System.out.println("-------------------------");
            System.out.println("0. Exit!!!");
            System.out.println("1. Nhap giang vien co huu");
            System.out.println("2. Nhap giang vien thinh giang");
            System.out.println("3. Viet ra danh sach toan bo giang vien");
            System.out.println("4. Sua 1 giang vien");
            System.out.println("5. Tim kiem giang vien tu...");
            System.out.println("6. Dua ra tong so giang vien co huu duoc nhom theo so gio");
            System.out.println("Moi ban chon: ");
            System.out.println("-------------------------");
            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    q.nhapCH();
                    break;
                case 2:
                    q.nhapTG();
                    break;
                case 3:
                    q.in();
                    break;
                case 4:
                    q.sua();
                    break;
                case 5:
                    q.tk();
                    break;
                case 6:
                    q.thongKe();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
