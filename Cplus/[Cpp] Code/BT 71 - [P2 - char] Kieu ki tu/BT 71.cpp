#include<iostream>
#include<cstdint>
using namespace std;

int main () {
	char ch;
	cout << "Enter a character from your keyboard: ";
	cin >> ch;
	cout << ch << " - " << static_cast< int16_t >( ch ) << endl;
	/*Ta không thực hiện nhập 1 kí tự từ bàn phím, thay vào đó, ta nhập nhiều kí tự liên tiếp nhau, Biến ch (kiểu char) chỉ nhận vào 1 kí tự
	duy nhất là kí tự đầu tiên mà ta nhập vào. Vậy những kí tự còn lại sẽ vẫn còn được lưu trữ tạm thời bên trong đối tượng file stdin
	Để kiếm chứng điều này, ta thêm một đoạn mã nhỏ sau khi in ra kí tự của biến ch trên màn hình: */


	//check if there is any character exist in stdin file object
	if ( !cin.eof () ) {
		cout << "There are some character more in stdin file object" << endl;
	}
	/*Nếu cin.eof() trả về giá trị là đúng, điều này có nghĩa chúng ta đã lấy hết kí tự trong đối tượng file stdin ra và đọc được kí tự kết thúc
	file (EOF = End of file). Vì thế, nếu điều này không xảy ra, tức là !cin.eof() là đúng, nghĩa là vẫn còn kí tự bên trong đối tượng file stdin.*/

	/*VD ta nhập vào "ABCDEF" và biến ch (kiểu char) nhận vào kí tự đầu tiên (kí tự 'A'), chương trình thông báo tiếp vẫn còn kí tự tồn tại bên trong đối
	tượng file stdin.
	Vì thế, khi chúng ta tiếp tục thêm vào dòng lệnh nhập kí tự khác phía sau đoạn chương trình trên, nó sẽ không dừng lại chờ người dùng nhập kí tự nữa
	mà nó lấy luôn kí tự tiếp theo trong đối tượng file stdin để đưa vào biến. Chạy đoạn mã lệnh sau để kiểm chứng kết quả: */


	//Continue reading a character from stdin file object
	char next_ch;
	cin >> next_ch;
	cout << "The next character is " << next_ch << endl;
	/*Biến ch nhận vào kí tự đầu tiên là 'A', biến next_ch lấy ngay kí tự 'B' mà không đợi người dùng nhập thêm kí tự khác.

	Sẽ có trường hợp chúng ta chỉ muốn nhận vào biến kí tự đầu tiên chúng ta nhập vào, những kí tự thừa phía sau có thể là do chúng ta nhấn nhầm
	phím nào đó, và chúng ta muốn loại bỏ những kí tự thừa đi để nhập lại kí tự khác cho biến char tiếp theo. Trong trường hợp này, có hai cách để
	thực hiện xóa toàn bộ dữ liệu đang tồn tại trong đối tượng file stdin: */

	fflush ( stdin ); //xóa tất cả dữ liệu trong đối tượng tệp stdin, Hàm fflush nhận vào một đối tượng file mà chúng ta muốn xóa dữ liệu bên trong nó 
					  //(trong trường hợp này là đối tượng file stdin

	//hoặc: cin.ignore( INT64_MAX, '\n'); // Phương thức ignore này nhận vào 2 đối số là số kí tự nó sẽ bỏ qua, và kí tự khiến lệnh này dừng lại khi gặp 
										  //phải trong đối tượng file stdin, ở đây ta sử dụng kí tự '\n' là kí tự được tạo ra khi nhấn phím Enter.

	//Cách nhập khác: 
	char ch1;
	ch1 = cin.get (); // Cách 1 - get:  lấy phương thức trả về ký tự mà vừa nhập
	//cin.get ( ch1 ); //Cách 2 - get: đặt một biến char vào ngoặc
	//Cả 2 cách tương tự nhau
	cout << ch1 << endl;

	//*Lưu ý:
	cout << endl; /*tương đương với:*/ cout << '\n' << std::fflush;
	
	/*Sử dụng đối tượng std::endl sẽ làm sạch luôn stream, trong khi đó, sử dụng kí tự '\n' chỉ đơn giản là đưa kí tự xuống dòng lên màn hình.
	  Sử dụng std::endl khi cần đảm bảo cho ra kết quả ngay lập tức, cụ thể khi làm việc trên các thiết bị đầu ra chậm.
	  Sử dụng '\n' cho các trường hợp còn lại.*/

	system ( "pause" );
	return 0;
}