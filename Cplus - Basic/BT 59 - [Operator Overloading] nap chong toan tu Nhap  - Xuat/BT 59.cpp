#include<iostream>
#include<fstream>
using namespace std;

struct phanso {
	int tuso;
	int mauso;
};
typedef struct phanso PHANSO;

/*void nhap_phan_so ( PHANSO &ps ) {
	cout << "Nhap tu so: "; cin >> ps.tuso;
	cout << "Nhap mau so: "; cin >> ps.mauso;
	}*/

/*void xuat_phan_so ( PHANSO ps ) {
	cout << ( float ) ps.tuso / ps.mauso << endl;
	}*/

// nạp chồng lại toán tử ">>" để nhập dữ liệu từ bàn phím vào cho kiểu dữ liệu cấu trúc
/* Dữ liệu chúng ta có 2 luồng: luồng thứ nhất đi từ bàn phím vào
 luồng thứ 2 đi từ file vào*/

istream& operator >> ( istream& is, PHANSO &ps ) { // làm cái này là dữ liệu đi được từ bàn phím và từ file vì vậy ở dưới nên dùng "is" thì tổng quát hơn, đi được cả từ file vào
	cout << "Nhap tu so: "; is >> ps.tuso; // thay "is" bằng cin vẫn chạy bình thường
	cout << "Nhap mau so: "; is >> ps.mauso; // thay "is" bằng cin vẫn chạy bình thường
	return is;
}

ostream& operator << ( ostream& os, PHANSO &ps ) {
	os << ( float ) ps.tuso / ps.mauso << endl;
	return os;
}

int main () {
	PHANSO ps;
	PHANSO ps2;
	cout << "\n\t NHAP PHAN SO: " << endl;
	//nhap_phan_so ( ps );
	cin >> ps; // lúc này không cần hàm nhap_phan_so nữa có thể dùng trực tiếp cin >>
	cout << "\n\t XUAT PHAN SO: " << endl << ps;
	//xuat_phan_so ( ps );
	//cout << ps + ps2; Không thể dùng trực tiếp kiểu này để cộng 2 struct vì "+" được đinh sẵn chỉ để cộng các kiểu dữ liệu cơ bản. Vì vậy ta phải định nghĩa lại hoặc nạp chồng.

	system ( "pause" );
	return 0;
}