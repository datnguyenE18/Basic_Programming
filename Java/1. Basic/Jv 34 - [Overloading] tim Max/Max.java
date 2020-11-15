public class Max {
	public static void main( String[] args ) {
		int max;
		System.out.println("KIỂM TRA GIÁ TRỊ LỚN NHẤT");
		// cho 2 tham số
		max = testMax(5, 10);
		System.out.println("Max của 5 và 10 là: " + max);
		
		// cho 3 tham số
		max = testMax(5, 6, 7);
		System.out.println("Max của 5, 6 và 7 là: " + max);
	}
	
	public static int testMax( int a, int b ) {
		int max = 0;
		if ( a > b ) max = a;
		else if ( a == b ) System.out.println("2 số bằng nhau");
		else max = b;
		return max;
	}
	
	public static int testMax( int a, int b, int c ) {
		int max = 0;
		max = testMax(a, testMax(b, c));
		return max;
	}
}