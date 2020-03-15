public class XSXucXac {
	public static void main( String[] args ) {
		System.out.println("Số lần tung để 2 xúc xắc cùng mặt là: " + soLanTung());
	}
	
	private static int soLanTung() {
		int xucXac1 = tungXucXac();
		int xucXac2 = tungXucXac();
		int xucXac3 = tungXucXac();
		int dem = 0;
		while ( !( xucXac1 == xucXac2 && xucXac2 == xucXac3 ) ) {
			xucXac1 = tungXucXac();
			xucXac2 = tungXucXac();
			xucXac3 = tungXucXac();
			dem += 1;
		}
		return dem;
	}
	
	private static int tungXucXac() {
		int giaTri = ( int ) ( 6 * Math.random() ) +1;
		return giaTri;
	}
}