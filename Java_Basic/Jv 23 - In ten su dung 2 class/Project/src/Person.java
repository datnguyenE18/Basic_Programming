public class Person {
	
	// Đây là một trường (Field).
	// Lưu trữ tên người.
	public String name;
	
	// Đây là một Constructor (Phương thức khởi tạo)
	// Dùng nó để khởi tạo đối tượng.
	// Constructor này có một tham số.
	// Constructor luôn có tên giống tên của lớp.
	public Person( String persionName ) {
		// Gán giá trị từ tham số vào cho trường name.
		this.name = persionName;
	}
	
	// Đây là một phương thức trả về kiểu String.
	public String getName() {
		return this.name;
	}
	
}