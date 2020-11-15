import java.util.Scanner;

public class Demo {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Mã sinh viên: ");
		String msv = sc.nextLine();
		System.out.print(" Mật khẩu: ");
		String mk = sc.nextLine();
		System.out.print(" Họ và tên: ");
		String ten = sc.nextLine();
		
		System.out.print(" Email: ");
		String email = sc.nextLine();
		System.out.print(" Điện thoại: ");
		String phone = sc.nextLine();
		System.out.print(" Biển số xe: ");
		String bsx = sc.nextLine();
		System.out.print(" CMND: ");
		String cmnd = sc.nextLine();
		System.out.print(" Website: ");
		String web = sc.nextLine();
		
		String reMsv = "[A-Z]{5}";
		if ( !msv.matches(reMsv) ) {
			System.out.println(" Không hợp lệ ");
		}
		String reMk = ".{6,}";
		if ( !mk.matches(reMk) ) {
			System.out.println(" Khong hop le ");
		}
		String reTen = "[a-zA-Z ]+";
		if ( !ten.matches(reTen) ) {
			System.out.println(" Khong hop le ");
		}
		String reEmail = "\\w+@\\w+(\\. \\w+){1,2}";
		if ( !email.matches(reEmail) ) {
			System.out.println(" Khong hop le ");
		}
		String rePhone = "028\\d{8}";
		if ( !phone.matches(rePhone) ) {
			System.out.println(" Khong hop le ");
		}
		String reBsx = "5\\d-[A-Z]-((\\d{4})|(\\d{3}\\.{2}))";
		if ( !bsx.matches(reBsx) ) {
			System.out.println(" Khong hop le ");
		}
		String reCMND = "\\d{10}";
		if ( !cmnd.matches(reCMND) ) {
			System.out.println(" Khong hop le ");
		}
		String reWeb = "http://www\\.\\w+\\.\\w{2,4}";
		if ( !web.matches(reWeb) ) {
			System.out.println(" Khong hop le ");
		}
	}
}
