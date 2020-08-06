import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
	public static void main( String[] args ) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//Khóa chính là kiểu Integer, Đối tượng đi với khóa chính là kiểu chuỗi
		map.put(1, "ABCDEF");
		map.put(556, "Hello World");
		map.put(3, "From Vietnam");
		
		// Lấy toàn bộ tên ra:
		Collection<String> dsTen = map.values();
		for ( String ten : dsTen ) System.out.println(ten);
		
		// Lấy toàn bộ danh sách mã:
		System.out.println("Danh sách mã: ");
		Set<Integer> dsMa = map.keySet();
		for ( int ma : dsMa ) {
			System.out.println(ma);
		}
		
		// Lấy tên theo mã nhất định:
		String ten = map.get(556);
		System.out.println(ten);
	}
}
