
/*Phương thức sleep() của lớp Thread được sử dụng để tạm ngứng một thread cho một khoảng thời gian nhất định.
	Phương thức Thread.sleep() gây ra cho luồng hiện tại hiệu ứng đình chỉ thực thi trong một thời gian xác định.
	Đây là một cách hiệu quả để xử lý thời gian có sẵn cho các luồng khác của một ứng dụng hoặc các ứng dụng khác mà
	có thể được chạy trên một hệ thống máy tính.
 */

public class SleepMessages {
	public static void main( String args[] ) throws InterruptedException {
		String importantInfo[] = {
				"Mares eat oats",
				"Does eat oats",
				"Little lambs eat ivy",
				"A kid will eat ivy too"
		};
		
		for ( int i = 0; i < importantInfo.length; i++ ) {
			//Dừng 4 giây (4000 mini giây)
			Thread.sleep(4000);
			//In thông tin
			System.out.println(importantInfo[i]);
		}
	}
}


/*phương thức main() khai báo throws InterruptedException. Đây là một ngoại lệ mà sleeps ném khi luồng khác làm gián đoạn luồng hiện thời trong
khi sleep hoạt động. Trong ví dụ trên, vì không định nghĩa thêm một luồng nào khác để gây ra gián đoạn, nên nó không quan tâm đến việc bắt ngoại
lệ InterruptedException.*/
