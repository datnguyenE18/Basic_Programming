import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất ax + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a,b: ");
        System.out.print("a = ");
        Double a = sc.nextDouble();
        System.out.print("b = ");
        Double b = sc.nextDouble();
        if ( a == 0 ) {
            if ( b == 0 ) System.out.println("Phương trình đã cho có vô số nghiệm");
            else System.out.println("Phương trình đã cho vô nghiệm");
        } else {
            Double KQ = -b / a;
            System.out.print("Phương trình đã cho có nghiệm là: " + KQ + "\r\n");
        }
    }
}