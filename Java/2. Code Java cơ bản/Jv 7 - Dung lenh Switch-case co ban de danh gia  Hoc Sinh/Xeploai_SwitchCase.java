import java.util.Scanner;

public class Xeploai_SwitchCase {
	public static void main( String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Nhập xếp loại của bạn: ");
		String xepLoai = sc.nextLine();
		switch ( xepLoai ) {
			case "A":
				System.out.println("Ban thật xuất sắc");
				break;
			case "B":
				System.out.println("Ban thật giỏi");
				break;
			case "C":
				System.out.println("Sắp tuyệt vời rồi");
				break;
			case "D":
				System.out.println("Cố lên nào!");
				break;
			case "E":
				System.out.println("Hơi chủ quan nha");
				break;
			case "F":
				System.out.println("Chăm chỉ lên nào");
				break;
			default:
				System.out.println("Bạn hiểu ý tôi chứ?");
		}
	}
}
