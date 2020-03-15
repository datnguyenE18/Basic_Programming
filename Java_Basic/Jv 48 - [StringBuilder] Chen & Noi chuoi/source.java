public class source {
	public static void main( String[] args ) {
		// Nối bằng dấu "+" thường dành cho nỗi những chuỗi ngắn
		String s = "Hello" + " " + "World";
		s = s + "! From Vietnam.";
		System.out.println(s);
		
		/*Nối bằng StringBuilder() thường dùng để nối những chuỗi dài (Có một thử nghiệm cho thấy khi dùng dấu "+" để nối thì mất thời gian ~30'.
		 Nhưng cũng trong TH đó dùng StringBuilder chỉ mất ~1')*/
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" ");
		builder.append("World");
		builder.append("!");
		builder.append(" ");
		builder.append("From ");
		builder.append("Vietnam.");
		System.out.println(builder.toString());
		
		// Chèn chuỗi
		
		/*CHÈN CHUỖI ĐÃ CÓ BÊN TRÊN:*/
		builder.insert(12," We love everyone!");
		System.out.println(builder.toString());
		
		/*CHÈN CHUỖI MỚI TẠO:*/
		StringBuilder builder1 = new StringBuilder("The Earth,");
		builder1.insert(10," We love everyone!");
		System.out.println(builder1.toString());
	}
}