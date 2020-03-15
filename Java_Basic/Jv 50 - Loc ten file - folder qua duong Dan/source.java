import java.util.Scanner;
import java.util.StringTokenizer;

public class source {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập đường dẫn đến tệp: ");
		String s = sc.nextLine();
		String s2 = tachbaihatmp3(s);
		hamxoaduoi(s2);
	}
	
	private static String tachbaihatmp3( String n ) {
		String[] arr = n.split("/");
		StringTokenizer n2 = new StringTokenizer(n);
		int dem = 0;
		while ( n2.hasMoreElements() ) {
			String value = n2.nextToken();
			if ( value.contains("/") ) dem++;
		}
		System.out.println(arr[dem + 1]);
		return arr[dem + 1];
	}
	
	private static void hamxoaduoi( String n ) {
		int n2 = n.lastIndexOf(".");
		String n3 = n.substring(0, n2);
		System.out.println(n3);
	}
}
