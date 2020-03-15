public class source {
	public static void main( String[] args ) {
		String a = "     TRAN       duY       THAnh     ";
		// Xóa khoản trắng:
		a=a.trim();
		
		byte[] b = a.getBytes(); // Chuyển Đổi chuỗi thành mảng các byte
		for ( int i = 1; i < a.length(); i++ ) {
			if ( 'A' <= b[i] && b[i] <= 'Z' && b[i - 1] != ' ' ) {
				b[i] = ( byte ) ( b[i] + 32 );
			}
			if ( b[i - 1] == ' ' && 'a' <= b[i] && b[i] <= 'z' ) {
				b[i] = ( byte ) ( b[i] - 32 );
			}
		}
		String c = new String(b); // Chuyển mảng các byte thành chuỗi
		
		// Xóa khoảng trắng thừa ở giữa:
		String[] aWord = c.split("  ");
		for ( String name : aWord )
			System.out.print(name);
	}
}
