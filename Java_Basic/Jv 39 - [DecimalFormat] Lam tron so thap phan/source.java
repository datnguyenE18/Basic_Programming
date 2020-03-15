import java.text.DecimalFormat;
import java.util.Scanner;

public class source {
	public static void main( String[] args ) {
		DecimalFormat dcf = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = ( double ) a / b;
		System.out.println(dcf.format(c));
	}
}