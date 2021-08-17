package e18cn1.baitap2;

import java.util.Scanner;
import e18cn1.baitap1.Student;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số Sinh Viên: ");
        int soSV = sc.nextInt(); // Số sinh viên
        Student[] students = new Student[soSV];

        // Nhập thông tin n sinh viên:
        System.out.println("\n--- Nhập Thông Tin ---");
        for ( int i = 0; i < soSV; i++ ) {
            System.out.println("+) SV " + ( i + 1 ) + ": ");
            students[i] = new Student();
            students[i].importInfo();
        }

        // In ds sinh viên:
        System.out.println("\n--- DSSV ---");

        for ( int i = 0; i < soSV; i++ ) {
            System.out.print(( i + 1 ) + ". ");
            students[i].display();
        }
    }
}

/*
run:
Số Sinh Viên: 2

--- Nhập Thông Tin ---
+) SV 1: 
Nhập Tên: Nguyen An
Nhập MSV: B18DCCN235
Lớp: D18CQCN09
Khóa: D18
+) SV 2: 
Nhập Tên: Nguyen Thanh
Nhập MSV: B18DCCT298
Lớp: D18CQDT05
Khóa: D18

--- DSSV ---
1. Nguyen An - B18DCCN235 - D18CQCN09 - D18
2. Nguyen Thanh - B18DCCT298 - D18CQDT05 - D18
 */
