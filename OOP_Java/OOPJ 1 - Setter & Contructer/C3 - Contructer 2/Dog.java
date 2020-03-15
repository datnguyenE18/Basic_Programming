public class Dog {
	private int chieucao;
	private int cannang;
	private String mau;
	
	public Dog( int height, int weight, String color ) {
		this.chieucao = height;
		this.cannang = weight;
		this.mau = color;
	}
	
	public Dog() {
		this(0, 0, "Blue");
	}
	
	public int getHeight() {
		return chieucao;
	}
	
/*	public void setHeight( int height ) {
		this.chieucao = height;
	}*/
	
	public int getWeight() {
		return cannang;
	}
	
/*	public void setWeight( int weight ) {
		this.cannang = weight;
	}*/
	
/*	public void setColor( String color ) {
		System.out.println("ĐÂY LÀ HÀM setter");
		this.mau = color.toLowerCase();
	}*/
	
	public String getColor() {
		System.out.println("Thông số: ");
		return this.mau;
	}
}
	

