import java.util.Scanner;

public class Scan {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		// Nhập tên:
		System.out.print("Nhap ten: ");
		String ten = sc.nextLine();
		
		//Nhập tuổi:
		System.out.print("Nhap tuoi: ");
		Float tuoi = sc.nextFloat();
		sc.close();
		
		System.out.printf("%s nam nay %.2f tuoi ", ten, tuoi);
	}
}