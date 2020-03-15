import java.util.Scanner;

public class Bai1-C2{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập điểm: ");
        Float diem = sc.nextFloat();
        System.out.printf("%s - %.1f điểm", hoTen, diem);
    }
}