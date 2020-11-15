import java.util.Scanner;

import static java.lang.Thread.sleep;

public class DemNguoc {
	public static void main( String[] args ) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cài đặt thời gian: ");
		int soDem = sc.nextInt();
		while ( soDem > 0 ) {
			System.out.printf(" Thời gian còn lại: %d giây\n", soDem);
			soDem--;
			sleep(1000);
		}
		System.out.println("Time's out!");
	}
}
