public class source {
	public static void main( String[] args ) {
		//Nối bởi ký tự thường
		String s = "Donald Trump;Putin;Kim Jong Un";
		String[] arr = s.split(";");
		for ( String name : arr )
			System.out.println(name);
		
		System.out.println("-------------------------------------");
		
		String s1 = "VN075AMR, Đỗ Nam Trung, A-Spy";
		String[] arr1 = s1.split(",");
		if ( arr1.length == 3 ) {
			System.out.println("Alias: " + arr1[0]);
			System.out.println("Real name: " + arr1[1]);
			System.out.println("Position: " + arr1[2]);
		}
		
		System.out.println("===================================");
		
		//Nối bởi các ký tự đặc biệt:
		String s2 = "VN075AMR| Đỗ Nam Trung| A-Spy";
		String[] arr2 = s2.split("\\|");
		if ( arr2.length == 3 ) {
			System.out.println("Alias: " + arr2[0]);
			System.out.println("Real name: " + arr2[1]);
			System.out.println("Position: " + arr2[2]);
		}
	}
}