import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class source {
	
	public static void nhapmang( double a[], int n ) {
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i < n; i++ ) {
			System.out.print("a[" + i + "]= ");
			a[i] = sc.nextDouble();
		}
	}
	
	public static void xuatmang( double a[], int n ) {
		for ( int i = 0; i < n; i++ ) {
			System.out.print(a[i] + ",\t");
		}
		System.out.println("\n");
	}
	
	public static void main( String[] args ) {
		try {
			Scanner sc = new Scanner(System.in);
			double[] a;
			System.out.print("Nhập số phần tử của mảng: ");
			int n = sc.nextInt();
			a = new double[n];
			System.out.println("===========================================");
			System.out.println("Nhập từng phần tử của mảng: ");
			nhapmang(a, n);
			System.out.println("===========================================");
			System.out.println("Các phần tử trong mảng là: ");
			xuatmang(a, n);
		} catch ( Exception e ) {
			System.out.println("Oops! Có lỗi xảy ra rồi. Chi tiết: ");
			e.printStackTrace();
			System.out.println("Làm ơn thử lại.");
			System.out.println("Nếu không được xin tra mã lỗi tại:");
			URL url = null;
			try {
				url = new URL("https://www.google.com | hoặc tại | https://daynhauhoc.com/");
			} catch ( MalformedURLException n ) {
				n.printStackTrace();
			}
			System.out.println(url.toString());
		} finally {
			System.out.println("Xin cảm ơn!");
		}
	}
}