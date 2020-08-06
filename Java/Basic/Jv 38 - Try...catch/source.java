import java.util.Scanner;

public class source {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhập số a, b= ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			int thuong = a / b;
			System.out.println("Thương a/b =" + thuong);
			System.out.println("Cảm ơn đã dùng phần mềm");
		} catch ( Exception ex ) {
			System.out.println("Không thể thực thi, chi tiết lỗi: ");
			ex.printStackTrace();
		}
		System.out.println("Cảm ơn đã dùng phần mềm");
	}
}