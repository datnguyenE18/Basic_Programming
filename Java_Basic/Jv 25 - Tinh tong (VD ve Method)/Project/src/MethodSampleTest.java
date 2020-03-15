public class MethodSampleTest {
	
	public static void main(String[] args) {
		
		// Tạo đối tượng MethodSample
		MethodSample obj = new MethodSample();
		
		// Gọi phương thức getText()
		String text = obj.getText();
		
		System.out.println("Text = " + text);
		
		// Gọi phương thức setText(String)
		obj.setText("New Text");
		
		System.out.println("Text = " + obj.getText());
		
		// Phương thức tĩnh có thể được gọi thông qua lớp.
		// Cách này được khuyến khích dùng. (**)
		int sum = MethodSample.sum(10, 20, 30);
		
		System.out.println("Sum  10,20,30= " + sum);
		
		// Hoặc gọi thông qua đối tượng.
		// Cách này không được khuyến khích. (**)
		int sum2 = obj.sum(20, 30, 40);
		
		System.out.println("Sum  20,30,40= " + sum2);
	}
	
}