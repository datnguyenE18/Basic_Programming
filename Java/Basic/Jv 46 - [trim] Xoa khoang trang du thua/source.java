public class source {
	public static void main( String[] args ) {
		String s = "  Hello World  ";
		System.out.println(s);
		System.out.println("Kích thước chuỗi là: " + s.length());
		
		// Xóa khoảng trắng dư thừa hai bên:
		System.out.println("===================================================");
		s = s.trim();
		System.out.println(s);
		System.out.println("Kích thước chuỗi mới là: " + s.length());
		System.out.println("===================================================");
		
		// Xóa khoảng trắng bên trái:
		String s1 = "  Hello World  ";
		int vtLeft = 0;
		int i = 0;
		for ( i = 0; i < s1.length(); i++ ) {
			char c = s1.charAt(i);
			if ( c == ' ' ) vtLeft = ( i );
			else break;
		}
		s1 = s1.substring(i);
		System.out.println(s1);
		System.out.println("Kích thước chuỗi mới là: " + s1.length());
		System.out.println("===================================================");
		
		// Xóa khoảng trắng bên phải:
		String s2 = "  Hello World  ";
		int vtRight = 0;
		int i1 = 0;
		for ( i1 = s2.length() - 1; i1 >= 0; i1-- ) {
			char c1 = s2.charAt(i1);
			if ( c1 == ' ' ) vtRight = ( i1 );
			else break;
		}
		s2 = s2.substring(0, vtRight);
		System.out.println(s2);
		System.out.println("Kích thước chuỗi mới là: " + s2.length());
		System.out.println("===================================================");
	}
}
