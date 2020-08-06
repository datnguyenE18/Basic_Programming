public class Cat extends Animal {
	private int tail;
	private int legs;
	
	public void move() {
		System.out.println("Cat.move() called");
	}
	
	public void fun() {
		super.fun();
		System.out.println("Cat.fun() called");
	}
	
	public Cat( int weight, int size, String name, int tail, int legs ) {
		super(weight, size, name);
		System.out.println("Cat Contruction called");
		
		this.tail = tail;
		this.legs = legs;
	}
	
	public int getTail() {
		return tail;
	}
	
	public void setTail( int tail ) {
		this.tail = tail;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs( int legs ) {
		this.legs = legs;
	}
}
