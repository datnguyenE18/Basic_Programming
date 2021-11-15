import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
    public static final float PI = 3.14f; // hằng số PI

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình cầu r =");
        float r = sc.nextFloat(); // bán kính hình cầu
        DecimalFormat df = new DecimalFormat("#.###"); // Làm tròn số thập phân lấy sau dấy phẩy 3 chữ số
        float V = (float) (4 * PI * Math.pow(r, 3)); // Tính thể tích
        System.out.print(df.format(V)); // In ra thể tích với định dạng cho trước
    }
}
