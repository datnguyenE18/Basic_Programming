package e18cn1.baitap12;

import java.util.Scanner;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static Matrix nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int rows = sc.nextInt();

        System.out.print("col = ");
        int cols = sc.nextInt();
        Matrix mt = new Matrix(rows, cols);
        mt.input();
        return mt;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Menu --");
        System.out.println("1. Tinh tong hieu hai ma tran");
        System.out.println("2. Tinh tich hai ma tran");
        System.out.println("3. Tim ma tran chuyen vi");
        System.out.println("4. End!");
        boolean cont = true;
        do {
            System.out.print("Your chose (1 - 4): ");
            int chose = sc.nextInt();
            switch (chose) {
                case 1:
                    // -- Nhập hai ma trận --
                    System.out.println("Nhap ma tran 1:");
                    Matrix mt1 = nhap();
                    System.out.println("Nhap ma tran 2:");
                    Matrix mt2 = nhap();

                    // -- Tính ma trận --
                    System.out.println("--Tong hai ma tran--");
                    mt1.add(mt2).print();
                    System.out.println("--Hieu hai ma tran--");
                    mt1.sub(mt2).print();
                    break;

                case 2:
                    // -- Nhập hai ma trận --
                    System.out.println("Nhap ma tran 1:");
                    Matrix mt3 = nhap();
                    System.out.println("Nhap ma tran 2:");
                    Matrix mt4 = nhap();

                    // -- Tích ma trận --
                    mt3.mul(mt4).print();
                    break;

                case 3:
                    // -- Nhập hai ma trận --
                    System.out.println("Nhap ma tran: ");
                    Matrix mt = nhap();

                    // -- Ma trận chuyển vị --
                    mt.transpose().print();
                    break;

                case 4:
                    System.out.println("End!");
                    cont = false;
                    break;

                default:
                    cont = true;
            }
        } while ( cont );
    }
}

/*
run:
-- Menu --
1. Tinh tong hieu hai ma tran
2. Tinh tich hai ma tran
3. Tim ma tran chuyen vi
4. End!
Your chose (1 - 4): 5
Your chose (1 - 4): 1
Nhap ma tran 1:
row = 3
col = 2
1 3
5.6 7
8 9
Nhap ma tran 2:
row = 3
col = 2
5 8
6 4
3 1
--Tong hai ma tran--
6.0 11.0 
11.6 11.0 
11.0 10.0 
--Hieu hai ma tran--
-4.0 -5.0 
-0.4000001 3.0 
5.0 8.0 
Your chose (1 - 4): 2
Nhap ma tran 1:
row = 5
col = 3
1 5 8
6 9 8
1 2 6
1 4 5
2 6 8
Nhap ma tran 2:
row = 1
col = 2
1 2
Invalid!
0.0 0.0 
0.0 0.0 
0.0 0.0 
0.0 0.0 
0.0 0.0 
Your chose (1 - 4): 4
End!
*/