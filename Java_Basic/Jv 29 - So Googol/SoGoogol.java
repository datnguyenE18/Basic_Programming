public class SoGoogol {
	public static void main( String[] args ) {
		String goolgol = "1";
		int len = goolgol.length();
		while ( len <= 100 ) {
			goolgol += "0";
			len = goolgol.length();
		}
		System.out.println(goolgol);
	}
}