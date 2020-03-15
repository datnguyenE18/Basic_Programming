import java.util.Scanner;

public class Xeploai_If_Else {
	public static void main( String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập điểm tổng kết: ");
		float diemTongKet = sc.nextFloat();
		if ( diemTongKet >= 8.5 )
			System.out.println("A");
		else if ( diemTongKet >= 7 )
			System.out.println("B");
		else if ( diemTongKet >= 5.5 )
			System.out.println("C");
		else if ( diemTongKet >= 4 )
			System.out.println("D");
		else
			System.out.println("F");
	}
}