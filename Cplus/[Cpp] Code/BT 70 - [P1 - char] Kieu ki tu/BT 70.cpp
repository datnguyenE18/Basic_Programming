#include<iostream>
#include<cstdint>
using namespace std;

int main () {
	//Test:
	cout << "===========================TEST===================================" << endl;
	char character; //Khai báo một biến kiểu char
	char ch ( 65 ); //khai báo một kiểu biến char và khởi tạo với "ASCII Code" (mã ASCII)
	char T = 'a'; //khai báo một kiểu biến char và khởi tạo bằng "symbol of ASCII table" (ký hiệu của bảng ASCII)
	char B = '🥰'; //thử in một kiểu không có trong bảng ASCII;

	// In ra màn hình:
	cout << ch << endl;
	cout << static_cast< int16_t >( ch ) << endl; //in ra mã Code của 1 biến kí tự
	cout << 'V' << "i" << "e" << "t" << " " << "N" << T << "m" << endl; // có thể in trực tiếp hoặc in thông qua biến
	cout << T << endl;
	cout << B << endl;
	cout << static_cast< char >( 67 ) << static_cast< char >( 43 ) << static_cast< char >( 43 ) << endl; //In trực tiếp mã Code của kí tự trong bảng mã ASCII (nhưng ép về kiểu char)
	/*Biến kiểu kí tự (char) thực tế cũng là một kiểu số nguyên kích thước 1 byte (tương đương với int8_t),
	nó lưu trữ giá trị là mã Code của kí tự đó, nhưng khi hiển thị lên màn hình, nó cho ra kết quả là kí tự (Symbol)
	chứ không in ra mã ASCII của kí tự đó.*/

	//in ra toàn bộ bảng mã ASCII trên màn hình dưới dạng <Code>: <Symbol>
	cout << "--------------------------------------------------------------------------------------------------------------" << endl;
	cout << "=======ASCII Table <Code>: <Symbol> hế=======" << endl;
	for ( int16_t ascii_code = 0; ascii_code <= 127; ascii_code++ ) {
		cout << ascii_code << '\t' << static_cast< char >( ascii_code ) << endl;
	}

	//Những khoảng trắng là kí hiệu đặc biệt tượng trưng. Ví dụ mã 7 là tượng trưng cho tiếng "Beep"
	// Những ký hiệu có hình dấu hỏi ở giữa ô trống là do sai font

	system ( "pause" );
	return 0;
}


/*Trường hợp cmd không thể in ra hết các kí hiệu trong bảng mã do sai font thì có thể chỉnh như sau:
+) CÁCH 1:
B1: Vào cmd,  gõ "chcp 65001"
B2: Chuột phải vào thanh tiêu đề (thanh trên cùng chứa các nút điều khiển)
B3: Chọn "Properties"
B4: Vào "Font"
B5: Chọn "Raster Fonts" để hiện các kí hiệu đặc biệt trong bảng mã ASCII (chọn Concolas để hiện có dấu tiếng việt) 

+) CÁCH 2:
Tải tool hỗ trợ. Tải tool ở đây: (https://drive.google.com/file/d/1g8Fe53BbZYoIvFCSfGsIkoRQ9kzhMp4W/view) hoặc ở đây: (http://www.fileformat.info/tool/unicodeinput/index.htm)
Bật lên, khi muốn gõ chữ nào thì ấn Alt + thì tool hiện ra, gõ [code của chữ mình cần gõ] (2) vào -> Enter

*cũng nhờ kĩ thuật này nên DNHconsole 2.0 sẽ hỗ trợ hiển thị tiếng Việt:
(1)http://www.fileformat.info/tip/microsoft/enter_unicode.htm 
(2)https://www.utf8-chartable.de/unicode-utf8-table.pl
*/