public class AnimalTest {
	
	public static void main( String[] args ) {
		
		// Khai báo một đối tượng Cat.
		Cat cat = new Cat();
		
		// Kiểm tra xem 'cat' có phải là đối tượng của Animal hay không.
		// Kết quả rõ ràng là true.
		boolean isAnimal = cat instanceof Animal;
		System.out.println("cat instanceof Animal?" + isAnimal);
		
		// ==> Meo
		// Gọi tới phương thức say() của Cat.
		cat.say();
		
		// Khai báo một đối tượng Animal.
		// Khởi tạo đối tượng thông qua Constructor của Cat.
		Animal cat2 = new Cat();
		
		// ==> Meo
		// Phương thức say() của Cat được gọi (Chứ không phải của Animal).
		cat2.say();
		
		// Tạo đối tượng Animal.
		// Thông qua constructor của lớp con, Ant.
		Animal ant = new Ant();
		
		// Ant không có phương thức say()
		// ==> Nó gọi vào phương thức say(), thừa kế từ lớp cha (Animal).
		ant.say();
	}
}