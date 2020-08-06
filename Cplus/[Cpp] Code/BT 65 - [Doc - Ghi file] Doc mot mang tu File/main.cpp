#include<iostream>
using namespace std;
#include<fstream>

// hàm kiểm tra số nguyên tố
bool Kiem_Tra_So_Nguyen_To ( int n ) {
	if ( n < 2 ) {
		return false;
	} else {
		if ( n == 2 ) {
			return true;
		} else {
			if ( n % 2 == 0 ) {
				return false;
			} else {
				for ( int i = 2; i < n; i++ ) {
					if ( n % i == 0 ) {
						return false;
					}
				}
			}
		}
	}	return true;
}


int main () {
	// đọc dữ liệu từ file
	ifstream FileIn;// khai báo ra lớp để đọc dữ liệu từ file
	FileIn.open ( "input.txt", ios_base::in );
	if ( FileIn.fail () == true ) { //Kiểm tra lỗi đọc File
		cout << "\nFile khong ton tai\n";
		system ( "pause" );
		return 0; // kết thúc chương trình
	}

	int arr[100];
	int i = 0;
	int dem = 0;
	// đọc mảng số nguyên từ file bằng cách kiểm tra nếu con trỏ chỉ vị chưa đến cuối file thì tiếp đọc
	while ( !FileIn.eof () ) { // <=> !FileIn.eof(), FileIn.eof() == false
		FileIn >> arr[i]; // đọc từng số nguyên có trong file
		i++;
		dem++;
	}

	// ghi dữ liệu lên file
	ofstream FileOut;
	FileOut.open ( "output.txt", ios_base::out );

	for ( int i = 0; i < dem; i++ ) {
		if ( Kiem_Tra_So_Nguyen_To ( arr[i] ) == true ) {
			FileOut << arr[i] << " ";
		}
	}

	FileOut.close ();
	FileIn.close (); // đóng file
	system ( "pause" );
	return 0;
}