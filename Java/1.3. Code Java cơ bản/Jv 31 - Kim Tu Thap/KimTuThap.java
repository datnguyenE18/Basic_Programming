import java.util.Scanner;

public class KimTuThap {
	public static void main( String[] args ) {
		System.out.println("Nhập số tầng kim tự tháp: ");
		Scanner sc = new Scanner(System.in);
		int soTang = sc.nextInt();
		int soGach = 0;
		for ( int i = 0; i <= soTang; i++ ) {
			soGach += Math.pow(i, 2);
		}
		System.out.println("Số khối cần để xây Kim Tự Tháp là: " + soGach);
	}
}