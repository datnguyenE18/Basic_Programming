public class source{
	public static void main(String[] args){
		String a = "Từ Nga xin chào Việt Nam";
		// subString có 1 đối số: lọc bên phải chuỗi
		String a1 = a.substring(3);
		System.out.println(a1);
		
		// subString có 2 đối số: lọc ở giữa chuỗi
		String a2 = a.substring(3,20);
		System.out.println(a2);
	}
}