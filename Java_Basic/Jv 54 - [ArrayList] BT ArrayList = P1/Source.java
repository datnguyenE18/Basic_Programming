import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Source {
	static ArrayList<Integer> dsData = new ArrayList<>();
	
	private static void menu() {
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm kiếm");
		System.out.println("6.Sắp xếp");
		System.out.println("7.Thoát");
		System.out.print("Chọn chế độ: ");
		int chon = new Scanner(System.in).nextInt();
		switch ( chon ) {
			case 1:
				them();
				break;
			case 2:
				xuat();
				break;
			case 3:
				sua();
				break;
			case 4:
				xoa();
				break;
			case 5:
				timkiem();
				break;
			case 6:
				sapxep();
				break;
			case 7:
				System.err.println("Cảm ơn đã sử dụng phần mềm!");
				System.exit(0);
				break;
			default:
				System.err.println("Không đúng. Xin nhập lại");
				break;
		}
	}
	
	private static void sapxep() {
		Collections.sort(dsData);
		System.out.println("Đã sắp xếp: " + dsData);
	}
	
	private static void timkiem() {
		System.out.print("Nhập số cần tìm: ");
		int k = new Scanner(System.in).nextInt();
		if ( dsData.contains(k) ) {
			System.out.println("Có số " + k + " trong Danh sách ");
		} else {
			System.out.println("Không có số " + k + " trong Danh sách");
		}
	}
	
	private static void xoa() {
		System.out.print("Nhập chính xác | chỉ số phần tử: ");
		int vt = new Scanner(System.in).nextInt();
		dsData.remove(( vt - 1 ));
		System.out.println("------------------------------------------------");
	}
	
	private static void sua() {
		System.out.print("Vị trí muốn sửa: ");
		int vt = new Scanner(System.in).nextInt();
		System.out.print("Giá trị mới: ");
		int value = new Scanner(System.in).nextInt();
		dsData.set(( vt - 1 ), value);
		System.out.println("------------------------------------------------");
	}
	
	private static void xuat() {
		for ( int i = 0; i < dsData.size(); i++ ) {
			System.out.print(dsData.get(i) + "\t");
		}
		System.out.println("\n" + "---------------------------------------");
	}
	
	private static void them() {
		System.out.print("Nhập giá trị muốn thêm: ");
		int value = new Scanner(System.in).nextInt();
		dsData.add(value);
		System.out.println("------------------------------------------------");
	}
	
	public static void main( String[] args ) {
		while ( true ) {
			menu();
		}
	}
}