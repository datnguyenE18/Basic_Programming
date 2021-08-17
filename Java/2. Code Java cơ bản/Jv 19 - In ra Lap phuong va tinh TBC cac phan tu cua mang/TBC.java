public class TBC{
	public static void main( String[] args ) {
		double a[] = { 10, 3, 5, 6, 105, 46 };
		double tong = 0;
		System.out.print("Lập phương các phần tử mảng: ");
		for ( double i : a ) {
			System.out.print(Math.pow(i, 3) + ", ");
			tong += i;
		}
		double TB = tong / ( a.length );
		System.out.print("\r\n");
		System.out.print("Trung bình cộng các phần tử mảng: " + TB);
	}
}
