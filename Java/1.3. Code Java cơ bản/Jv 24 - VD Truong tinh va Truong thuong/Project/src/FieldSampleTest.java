public class FieldSampleTest {
	
	public static void main( String[] args ) {
		
		// Tạo đối tượng thứ nhất.
		FieldSample obj1 = new FieldSample("Value1");
		
		System.out.println("obj1.myValue= " + obj1.myValue);
		
		// In ra giá trị của trường tĩnh MY_STATIC_FIELD.
		// Tham chiếu thông qua đối tượng (Không được khuyến khích).
		System.out.println("obj1.MY_STATIC_FIELD= " + obj1.MY_STATIC_FIELD);
		
		// In ra giá trị của trường tĩnh - MY_STATIC_FIELD.
		// Với các trường tĩnh, có thể truy cập tới nó thông qua lớp.
		// (Cách này được khuyến khích).
		System.out.println("FieldSample.MY_STATIC_FIELD= " + FieldSample.MY_STATIC_FIELD);
		
		// Tạo đối tượng thứ 2:
		FieldSample obj2 = new FieldSample("Value2");
		
		System.out.println("obj2.myValue= " + obj2.myValue);
		
		System.out.println("obj2.MY_STATIC_FIELD= " + obj2.MY_STATIC_FIELD);
		
		System.out.println(" ------------- ");
		
		// Trường tĩnh được sử dụng chung cho mọi đối tượng của cùng một lớp.
		// Gán giá trị mới cho trường tĩnh MY_STATIC_FIELD.
		// (Có thể dùng cách: FieldSample.MY_STATIC_FIELD = 200)
		obj1.MY_STATIC_FIELD = 200;
		
		// Tại đây sẽ in ra giá trị 200.
		System.out.println("obj2.MY_STATIC_FIELD= " + obj2.MY_STATIC_FIELD);
	}
	
}