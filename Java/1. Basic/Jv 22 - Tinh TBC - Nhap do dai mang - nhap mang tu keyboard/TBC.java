import java.util.Scanner;

public class TBC {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Số chữ số cần tính:  ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Nhập các sô cần tính: ");
		int tong = 0;
		for ( int i = 0; i <= size - 1; i++ ) {
			System.out.print("Số thứ " + (i + 1) + ": ");
			a[i] = sc.nextInt();
			System.out.println("--------------------------Lập phương là: " + Math.pow(a[i], 3));
			tong += a[i];
		}
		Double TBC = (double) tong / (double) size ;
		System.out.println("TBC các số nguyên đã nhập là: " + TBC);
	}
}
