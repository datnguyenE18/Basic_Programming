#include<iostream>
using namespace std;
#include"DoHoa.h"
#include<string>
#include<iomanip> // hàm này hỗ trợ dùng hàm setw - tùy chỉnh độ rộng của dữ liệu muốn hiển thị ra màn hình

// setw(<1 số nguyên>): hiển thị độ rộng của kết quả muốn in ra màn hình
// setw(3): dành ra 3 vị trí để hiển thị kết quả


struct sinhvien {
	string hoten; // nhập tối đa 30 kí tự
	string maso; // nhập tối đa 12 kí tự
	float diem; // điểm 
};
typedef struct sinhvien SinhVien;

// nhập thông tin sinh viên
void Nhap_Thong_Tin_Sinh_Vien ( SinhVien &x ) {
	fflush ( stdin );
	cout << "\nNhap ho ten: ";
	getline ( cin, x.hoten );
	fflush ( stdin );
	cout << "\nNhap ma sinh vien: ";
	getline ( cin, x.maso );
	cout << "\nNhap diem sinh vien: ";
	cin >> x.diem;
}

// hàm xuất thông tin sinh viên

void Xuat_Thong_Tin_Sinh_Vien ( SinhVien x ) {
	cout << "\nHo ten sinh vien: " << x.hoten;
	cout << "\nMa sinh vien: " << x.maso;
	cout << "\nDiem sinh vien: " << x.diem;
}

void Xuat_Thong_Tin_Sinh_Vien_1 ( SinhVien x ) {
	cout << setw ( 30 ) << left << x.hoten << "\t";
	cout << setw ( 12 ) << left << x.maso << "\t";
	cout << setw ( 4 ) << left << x.diem;
}
int main () {
	SinhVien x;
	SinhVien y;

	cout << "\n\n\t\t NHAP THONG TIN SINH VIEN\n";
	Nhap_Thong_Tin_Sinh_Vien ( x );
	cout << "\n\n\t\t NHAP THONG TIN SINH VIEN\n";
	Nhap_Thong_Tin_Sinh_Vien ( y );


	/*cout << "\n\n\t\t XUAT THONG TIN SINH VIEN\n";
	Xuat_Thong_Tin_Sinh_Vien(x);
	cout << endl;
	Xuat_Thong_Tin_Sinh_Vien(y);*/

	cout << "\n\n\t\t THONG TIN SINH VIEN\n\n";
	textcolor ( 14 );
	cout << setw ( 30 ) << left << "Ho ten" << "\t" << setw ( 12 ) << left << "Ma sinh vien" << "\t" << setw ( 4 ) << left << "Diem" << endl;
	textcolor ( 7 );

	textcolor ( 4 );
	Xuat_Thong_Tin_Sinh_Vien_1 ( x );
	cout << endl;
	Xuat_Thong_Tin_Sinh_Vien_1 ( y );

	system ( "pause" );
	return 0;
}