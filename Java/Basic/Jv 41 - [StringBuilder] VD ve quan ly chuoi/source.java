public class source {
	public static void main( String[] args ) {
		StringBuilder sb = new StringBuilder();
		// append : Nối chuỗi:
		sb.append("Hello");
		sb.append(" ");
		sb.append("World!!");
		
		String s = sb.toString();
		System.out.println(s);
		
		// delete : xóa chuỗi:
		sb.delete(11, 13);
		s = sb.toString();
		System.out.println(s);
		
		// insert : chèn chuỗi:
		sb.insert(11, " ");
		sb.insert(12, "From");
		sb.insert(16, " ");
		sb.insert(17, "Vietnam!");
		s = sb.toString();
		System.out.println(s);
		
		// reverse : đảo chuỗi
		sb.reverse();
		s = sb.toString();
		System.out.println(s);
	}
}