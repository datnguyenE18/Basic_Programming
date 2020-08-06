// Nhập tọa độ 3 đỉnh của tam giác. Tính độ dài từng cạnh
#include<bits\stdc++.h>
using namespace std;

struct toado {
	float x; // tọa độ điểm x thuộc trục hoành
	float y; // tọa độ điểm y thuộc trục tung
};
typedef struct toado TOADO;

// Hàm nhập tọa độ
void Nhap_Toa_Do ( TOADO &ntd ) { // cần dấu "&" để lưu lại những gì ta vừa nhập ở hàm này
	cout << "\nNhap x: "; cin >> ntd.x;
	cout << "\nNhap y: "; cin >> ntd.y;
}

// Hàm xuất tọa độ
void Xuat_Toa_Do ( TOADO xtd ) {
	cout << "(" << xtd.x << "," << xtd.y << ")" << endl;
}

// Hàm tính độ dài:
float Tinh_Do_Dai ( TOADO N, TOADO M ) {
	return sqrt ( pow ( ( N.x - M.x ), 2 ) + pow ( ( N.y - M.y ), 2 ) );
}

// Hàm tính nửa chu vi:
float Nua_Chu_Vi ( float a, float b, float c ) {
	return ( a + b + c ) / 2;
}

int main () {
	//Vì tam giác có 3 đỉnh với 3 bộ tọa độ nên ta khai báo 3 TOADO:
	TOADO A;
	TOADO B;
	TOADO C;

	float AB, BC, AC;
	float p; // Nửa chu vi

	cout << "\n\n\t\t Nhap toa do diem A: " << endl;
	Nhap_Toa_Do ( A );
	cout << "\n\n\t\t Nhap toa do diem B: " << endl;
	Nhap_Toa_Do ( B );
	cout << "\n\n\t\t Nhap toa do diem C: " << endl;
	Nhap_Toa_Do ( C );

	cout << "=================== Display Results==================" << endl;
	//Xuất tọa độ 3 điểm A,B,C:
	cout << "Toa do diem A: "; Xuat_Toa_Do ( A );
	cout << "Toa do diem B: "; Xuat_Toa_Do ( B );
	cout << "Toa do diem C: "; Xuat_Toa_Do ( C );
	cout << "\n\n";

	//Độ dài từng cạnh:
	AB = Tinh_Do_Dai ( A, B );
	BC = Tinh_Do_Dai ( B, C );
	AC = Tinh_Do_Dai ( A, C );
	cout << "Do dai AB: " << AB << " m" << endl;
	cout << "Do dai BC: " << BC << " m" << endl;
	cout << "Do dai AC: " << AC << " m" << endl;
	cout << "\n\n";

	// Tính diện tích tam giác:
	p = Nua_Chu_Vi ( AB, BC, AC );
	cout << "Dien tich tam giac: " << sqrt ( p*( p - AB )*( p - BC )*( p - AC ) ) << " m2" << endl;

	system ( "pause" );
	return 0;
}