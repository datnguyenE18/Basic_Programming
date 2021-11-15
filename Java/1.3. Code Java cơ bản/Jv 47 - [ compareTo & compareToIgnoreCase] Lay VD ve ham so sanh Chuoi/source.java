public class source {
	public static void main( String[] args ) {
		String s1 = "Hạrj hjús";
		String s2 = "Hạnh phúc";
		String s3 = "Hạnh PHÚC";
		String s4 = " ";
		String s5 = "";
		String s6 = "á";
		String s7 = "a";
		String s8 = "ă";
		String s9 = "A";
		String s10 = "@";
		String s11 = "$";
		
		int x = s1.compareTo(s2);
		int x2 = s2.compareTo(s3);
		int x3 = s4.compareTo(s5);
		int x4 = s6.compareTo(s7);
		int x5 = s7.compareTo(s8);
		int x6 = s6.compareTo(s8);
		int x7 = s10.compareTo(s11);
		int x8 = s10.compareTo(s9);
		int x9 = s10.compareTo(s7);
		int x10 = s10.compareTo(s8);
		int x11 = s9.compareToIgnoreCase(s8);
		
		System.out.println(x);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		System.out.println(x7);
		System.out.println(x8);
		System.out.println(x9);
		System.out.println(x10);
		System.out.println(x11);
		
	}
}