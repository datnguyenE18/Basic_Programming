import java.util.StringTokenizer;

public class source {
	public static void main( String[] args ) {
		String a = new String("Hello World");
		
		//indexOf():
		int i = a.indexOf("L");
		int i1 = a.indexOf("l");
		System.out.println("Kí tự 'L' xuất hiện đầu tiên ở vị trí: " + ( i + 1 ));
		System.out.println("Kí tự 'l' xuất hiện đầu tiên ở vị trí: " + ( i1 + 1 ));
		System.out.println("================================================================");
		
		//lastindexOf():
		int i2 = a.lastindexOf("l");
		System.out.println("Kí tự 'l' xuất hiện cuối cùng ở vị trí: " + ( i2 + 1 ));
		System.out.println("================================================================");
		
		//contains():
		if ( a.contains("or") == true ) System.out.println("Có chứa kí tự 'or'");
		else System.out.println("Không chứ kí tự 'or'");
		if ( a.contains("ro") == true ) System.out.println("Có chứa kí tự 'or'");
		else System.out.println("Không chứ kí tự 'ro'");
		
		//StringTokenizer: tìm số lần xuất hiên kí tự trong chuỗi
		StringTokenizer sl = new StringTokenizer(a);
		int dem = 0;
		while ( sl.hasMoreTokens() ) {
			String value = sl.nextToken();
			if ( value.contains("or") ) dem++;
		}
		System.out.println("Tìm thấy " + dem + " lần xuất hiện kí tự [or] ");
	}
}