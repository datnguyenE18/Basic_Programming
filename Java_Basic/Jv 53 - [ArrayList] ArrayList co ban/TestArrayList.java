import java.util.ArrayList;

public class TestArrayList {
	public static void main( String[] args ) {
		ArrayList ds1 = new ArrayList(); // có thể lưu trữ mọi loại dữ liệu
			ds1.add(1);
			ds1.add(5.5);
			ds1.add(true);
			ds1.add("Hello World");
		ArrayList<Integer> ds2 = new ArrayList<Integer>(); // Chỉ định kiểu dữ liệu là Int
			ds2.add(1);
		ArrayList<Double> ds3 = new ArrayList<Double>(); // Chỉ định kiểu dữ liệu là Double
			ds3.add(5.5);
		ArrayList<Boolean> ds4 = new ArrayList<Boolean>(); // Chỉ định kiểu dữ liệu là Boolean
			ds4.add(true);
		ArrayList<String> ds5 = new ArrayList<String>(); // Chỉ định kiểu dữ liệu kiểu kí tự
			ds5.add("Hello");
			ds5.add(" World");
		for ( int i = 0; i < ds5.size(); i++ ) System.out.print(ds5.get(i));
	}
}