import java.util.Scanner;

public class DuyetMang {
	public static void main( String[] args ) {
		// Khai báo
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] a = new float[n];
		
		// Nhập các số:
		for ( int j = 0; j < n; j++ ) a[j] = ( float ) sc.nextFloat();
		
		// Tính tổng
		int tong = 0;
		for ( int i = 0; i < n; i++ ) {
			if ( i % 2 == 0 ) {
				System.out.print(i + ", ");
				tong += i;
			}
		}

		//In ra tổng:
		System.out.print("\r\n");
		System.out.print("Tổng là: " + tong);
	}
}
