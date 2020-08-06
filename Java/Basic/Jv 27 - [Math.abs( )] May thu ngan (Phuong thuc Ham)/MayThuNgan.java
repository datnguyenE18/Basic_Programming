import java.util.Scanner;

public class MayThuNgan {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mệnh giá hàng (VNĐ / đơn vị sản phẩm): ");
		double menhGia = sc.nextDouble();
		System.out.println("Số lượng hàng: ");
		double soLuong = sc.nextDouble();
		double tongGia = menhGia * soLuong;
		System.out.println("Số tiền khách hàng trả (VNĐ): ");
		double tienKhachHangTra = sc.nextDouble();
		double tien = tienThoi(tongGia, tienKhachHangTra);
		if ( tien > 0 ) System.out.println("Khách trả thừa: " + tien + "VNĐ");
		else if ( tien < 0 ) System.out.println("Khách trả thiếu: " + Math.abs(tien) + "VNĐ");
		else System.out.println("Khách hàng đã trả đủ");
	}
	
	private static double tienThoi( double tongGia, double tienKhachHangTra ) {
		double tien = tienKhachHangTra - tongGia;
		return tien;
	}
}