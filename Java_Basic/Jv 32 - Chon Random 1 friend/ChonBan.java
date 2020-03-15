import java.util.Scanner;

public class ChonBan {
	public static void main( String[] args ) {
		String[] lop = { "Nguyễn Văn A", "Trần Đình B", "Phạm Vũ C", "Lê Thị D", "Lại Đức E", "F", "G", "H", "I", "K", "M", "N" };
		Scanner sc = new Scanner(System.in);
		double Stt = Math.random() * 11;
		int chon = ( int ) Stt;
		System.out.println(lop[chon]);
	}
}