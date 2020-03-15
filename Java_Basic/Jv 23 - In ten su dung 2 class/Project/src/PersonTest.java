public class PersonTest {
	
	public static void main( String[] args ) {
		// Tạo một đối tượng từ lớp Person
		// Khởi tạo đối tượng này từ Constructor của lớp Person
		Person edison = new Person("Edison");
		
		// Lớp Person có phương thức getName()
		// Sử dụng đối tượng để gọi phương thức getName():
		String name = edison.getName();
		System.out.println("Person 1: " + name);
		
		// Tạo một đối tượng từ class Person.
		// Khởi tạo đối tượng này tử cấu tử của class Person
		Person billGate = new Person("Bill Gates");
		
		// Lớp Person có trường name là công khai (public)
		// Sử dụng đối tượng để tham chiếu tới nó.
		String name2 = billGate.name;
		System.out.println("Person 2: " + name2);
		
	}
	
}