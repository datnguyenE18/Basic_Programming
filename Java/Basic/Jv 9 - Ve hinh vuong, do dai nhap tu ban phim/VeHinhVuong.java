import java.util.Scanner;

public class VeHinhVuong {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài hình vuông a = ");
        int a = sc.nextInt();
        for ( int i = 1; i <= a; i++ ) {
            for ( int j = 1; j <= a; j++ ) {
                System.out.print("*  ");
            }
            System.out.print("\r\n");
        }
    }
}