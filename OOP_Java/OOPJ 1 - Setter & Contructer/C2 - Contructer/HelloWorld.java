public class HelloWorld {
	public static void main( String[] args ) {
		Dog pitbull = new Dog();
		Dog becgie = new Dog(100, 100, null);
		//pitbull.setColor("Blue");
		//becgie.setHeight(100);
		//becgie.setWeight(100);
		System.out.println("+) PITBULL: color-" + pitbull.getColor() + "| Heigh-" + pitbull.getHeight() + "| Weigh-" + pitbull.getHeight() + "\n");
		System.out.println("+) BECGIE: Color-" + becgie.getColor() + "| Heigh-" + becgie.getHeight() + "| weigh-" + becgie.getWeight());
	}
}