#include<iostream>
using namespace std;
#include<fstream>

int main () {
	// ====================== ĐỌC FILE ======================
	// CÚ PHÁP: ifstream <Tên biến file>;
	// BƯỚC 1: KHAI BÁO RA BIẾN ĐỂ ĐỌC FILE
	ifstream FileIn; // khai báo ra 1 biến FileIn để đọc dữ liệu từ file (ta có thể đặt tên bất kì nhưng đặt như này dễ nhớ và sử dụng) 
	// BƯỚC 2: MỞ FILE CẦN ĐỌC DỮ LIỆU
	// open(<Tên đường dẫn đến file cần mở - để đọc - đây là 1 cái chuỗi>, <chế độ làm việc với file>); Có thể không cần đường dẫn mà ghi luôn tên File, lúc đó chương trính sẽ tìm file đó ngay trong cùng Folder chứa nó 
	FileIn.open ( "C:\\Users\\Dell\\Desktop\\INPUT.TXT", ios_base::in );

	if ( FileIn.fail () == true ) {
		cout << "\nFile cua ban khong ton tai\n";
		system ( "pause" );
		return 0; // kết thúc chương trình
	}

	// BƯỚC 3: XỬ LÍ FILE - ĐỌC DỮ LIỆU TỪ FILE RA CHƯƠNG TRÌNH
	int x;
	int y;
	//cin >> x;
	FileIn >> x; // đọc số nguyên đầu tiên từ file
	//cin >> y;
	FileIn >> y; // đọc số nguyên tiếp theo từ file

	// BƯỚC 4: ĐÓNG FILE LẠI SAU KHI ĐÃ XỬ LÍ
	FileIn.close (); // đóng file lại sau khi xử lí
	//cout << "\nTong cua 2 so nguyen: " << x + y;

	// ====================== GHI FILE ======================
	ofstream FileOut;
	FileOut.open ( "C:\\Users\\Dell\\Desktop\\OUTPUT.TXT", ios_base::out );
	FileOut << x + y << endl; // lấy x + y rồi ghi vào file OUTPUT.TXT

	FileOut << 20 << endl;
	FileOut << 21;
	FileOut.close (); // đóng file lại
	system ( "pause" );
	return 0;
}