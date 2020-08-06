import java.util.Scanner;

public class BtChinhQuy {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		String Email = "\\w+\\@\\w+\\.\\w+";
		
		System.out.print("SĐT vùng Hà Nội: ");
		String numBerPhone = sc.nextLine();
		String NBP = "024\\d{7}";
		
		System.out.println("XÁC NHẬN THÔNG TIN ");
		if ( !email.matches(Email) ) System.out.println("Lưu ý! Email không đúng định dạng");
		else System.out.println("	* Email của bạn là: " + email);
		
		if ( !numBerPhone.matches(NBP) ) System.out.println("Lưu ý! SĐT bạn vừa nhập không phải mã vùng Hà Nội");
		else System.out.print("	* SĐT của bạn là: " + numBerPhone);
	}
}
