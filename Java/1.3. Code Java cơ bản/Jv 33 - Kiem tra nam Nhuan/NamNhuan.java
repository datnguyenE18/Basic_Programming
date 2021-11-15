import java.util.Scanner;

public class NamNhuan {
	public static void main( String[] args ) {
		
		System.out.println("Input a year :");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) {
			System.out.println("Year: " + year + " is the leap year");
		} else if ( year % 400 == 0 ) {
			System.out.println("Year: " + year + " is the leap year");
		} else {
			System.out.println("Year: " + year + " is not the leap year");
		}
	}
}
