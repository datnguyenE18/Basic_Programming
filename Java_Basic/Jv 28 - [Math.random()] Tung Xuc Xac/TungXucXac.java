import java.util.Scanner;

public class TungXucXac {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TUNG XÚC XẮC");
		System.out.println("Số xúc xắc cần tung: ");
		int soXucXac = sc.nextInt();
		for ( int i = 1; i <= soXucXac; i++ ) {
			int diemSo = ( int ) ( 6 * Math.random() ) + 1;
			System.out.println("Xúc xắc " + i + ": " + diemSo);
		}
	}
}