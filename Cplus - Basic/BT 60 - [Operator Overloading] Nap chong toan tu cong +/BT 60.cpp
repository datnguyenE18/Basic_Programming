#include<iostream>
#include<fstream>
using namespace std;

//Khai báo cấu trúc phân số (phanso):
struct phanso {
	int tuso;
	int mauso;
};
typedef struct phanso PHANSO;

// nạp chồng lại toán tử >> để nhập dữ liệu từ bàn phím vào cho kiểu dữ liệu cấu trúc
istream& operator >>( istream& is, PHANSO &ps ) {
	cout << "\nNhap tu so: ";
	is >> ps.tuso;
	cout << "\nNhap mau so: ";
	is >> ps.mauso;
	return is;
}

// nạp chồng lại toán tử << để xuất dữ liệu cho kiểu dữ liệu cấu trúc
ostream& operator <<( ostream& os, PHANSO ps ) {
	cout << ps.tuso << "/" << ps.mauso;
	return os;
}

// Hàm cộng hai phân số
PHANSO cong_phan_so ( PHANSO ps, PHANSO ps2 ) {
	PHANSO temp;
	temp.tuso = ( ps.tuso * ps2.mauso ) + ( ps2.tuso + ps.mauso );
	temp.mauso = ( ps.mauso * ps2.mauso );
	return temp;
}

// nạp chồng toán tử + để cộng trực tiếp 2 kiểu dữ liệu cấu trúc phân số
PHANSO operator +( PHANSO ps, PHANSO ps2 ) {
	PHANSO temp;
	temp.tuso = ( ps.tuso * ps2.mauso ) + ( ps2.tuso * ps.mauso );
	temp.mauso = ps.mauso * ps2.mauso;
	return temp;
}

int main () {
	PHANSO ps;
	PHANSO ps2;
	cout << "\n\t NHAP PHAN SO 1: " << endl;
	cin >> ps;
	cout << "\n\t XUAT PHAN SO 1: " << endl << ps;

	cout << "\n\t NHAP PHAN SO 2: " << endl;
	cin >> ps2;
	cout << "\n\t XUAT PHAN SO 2: " << endl << ps2;

	//cout << ps + ps2; Không thể dùng trực tiếp kiểu này để cộng 2 struct vì "+" được đinh sẵn chỉ để cộng các kiểu dữ liệu cơ bản. Vì vậy ta phải định nghĩa lại hoặc nạp chồng.
	//cout << "TONG HAI PHAN SO: " << endl;
	//cout << cong_phan_so ( ps, ps2 ); 
	cout << "\n\tTONG HAI PHAN SO: " << ( ps + ps2 ) << endl;

	system ( "pause" );
	return 0;
}