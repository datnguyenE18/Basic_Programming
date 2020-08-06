import java.util.Scanner;

public class Tong {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat(), b = sc.nextFloat();
		float c = a + b;
		System.out.printf("a = %.2f", a);
		System.out.printf("\nb = %.2f", b);
		System.out.printf("\n=> a + b = %.2f", c);
	}
}