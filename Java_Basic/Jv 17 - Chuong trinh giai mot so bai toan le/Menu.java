import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main( String[] args ) {
        menu();
    }
    
    public static void menu() {
        double a, b, c;
        int chon;
        do {
            System.out.println("CHƯƠNG TRÌNH GIẢI MỘT SỐ BÀI TOÁN");
            System.out.println("=======================================");
            System.out.println("1. Giải phương trình bậc nhất ax + b = 0");
            System.out.println("2. Giải phương trình bậc hai ax^2 + bx + c = 0");
            System.out.println("3. Tính tiền điện sử dụng");
            System.out.println("4. Kiểm tra SNT");
            System.out.println("5. Kết thúc");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            switch ( chon ) {
                case 1:
                    System.out.println("GIẢI PHƯƠNG TRÌNH BẬC NHẤT ax + b = 0");
                    System.out.print("Nhập a: ");
                    a = sc.nextDouble();
                    System.out.print("Nhập b: ");
                    b = sc.nextDouble();
                    giaiPtBac1(a, b);
                    break;
                case 2:
                    System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2 : ax^2+bx+c=0");
                    System.out.print("Nhập a: ");
                    a = sc.nextDouble();
                    System.out.print("Nhập b: ");
                    b = sc.nextDouble();
                    System.out.print("Nhập c: ");
                    c = sc.nextDouble();
                    giaiPtBac2(a, b, c);
                    break;
                case 3:
                    System.out.println("TÍNH TIỀN ĐIỆN");
                    System.out.print("Nhập số điện tháng này: ");
                    a = sc.nextDouble();
                    tienDien(a);
                    break;
                case 4:
                    System.out.println("KIỂM TRA SNT");
                    System.out.print("Nhập số cần kiểm tra: ");
                    int X = sc.nextInt();
                    kiemTraSNT(X);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    Continue();
                    break;
            }
        } while ( chon != 5 );
    }
    
    public static void giaiPtBac1( double a, double b ) {
        if ( a == 0 ) {
            if ( b == 0 ) System.out.println("Phương trình đã cho có vô số nghiệm");
            else System.out.println("Phương trình đã cho vô nghiệm");
        } else {
            Double KQ = -b / a;
            System.out.print("Phương trình đã cho có nghiệm là: " + KQ + "\r\n");
        }
    }
    
    public static void giaiPtBac2( double a, double b, double c ) {
        if ( a == 0 ) {
            if ( b == 0 ) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                double KQ = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất: " + KQ);
            }
        } else {
            double delTa = Math.pow(b, 2) - 4 * a * c;
            if ( delTa == 0 ) {
                double x = -b / ( 2 * a );
                System.out.println("Phương trình có nghiệm duy nhất: " + x);
            } else if ( delTa > 0 ) {
                double x1;
                double x2;
                x1 = ( -b + Math.sqrt(delTa) ) / ( 2 * a );
                x2 = ( -b - Math.sqrt(delTa) ) / ( 2 * a );
                System.out.println("Phương trình có hai nghiệm phân biệt: ");
                System.out.println("\tx1 = " + x1);
                System.out.println("\tx2 = " + x2);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
    
    public static void kiemTraSNT( int X ) {
        if ( X <= 0 ) {
            System.out.println(X + " không phải SNT");
            System.exit(0);
        } else if ( X != 0 ) {
            for ( int i = 2; i < X; i++ ) {
                if ( X % i == 0 ) {
                    System.out.println(X + " không phải là SNT");
                    System.exit(0);
                }
            }
        }
        System.out.println(X + " là SNT");
    }
    
    
    public static void tienDien( double a ) {
        double tongTienDien;
        if ( a <= 50 ) {
            tongTienDien = a * 1678;
        } else {
            tongTienDien = 50 * 1678 + ( a - 50 ) * 2014;
        }
        System.out.println("Số tiền bạn phải đóng là: " + tongTienDien + " VNĐ");
    }
    
    public static void Continue() {
        int intz = 1;
        do {
            if ( intz == 4 || intz == 6 ) {
                intz++;
                continue;
            }
            System.out.println("intz = " + intz);
            intz++;
        } while ( intz <= 9 );
    }
}
