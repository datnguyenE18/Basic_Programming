#include<bits/stdc++.h>
using namespace std;

struct NGAYTHANG {
	int ngay, thang, nam;
};

struct SV {
	string hoten;
	char masv[10];
	NGAYTHANG ngsinh;
	char gioitinh[8];
	float diem;
};

//Nhập thông tin một sinh viên
void Nhapsv ( SV *sv ) {
	// Nhập họ tên 1 sinh viên:
	do {
		fflush ( stdin ); // xóa bộ đệm
		cout << "\n\tNhap Ho Ten: "; getline ( cin, sv->hoten );
		if ( sv->hoten.length () > 100 ) cout << "\nHoTen qua dai! Yeu cau xac minh!";
	} while ( sv->hoten.length () > 100 );

	//Nhập mã sinh viên:
	fflush ( stdin );
	cout << "\n\tNhap Ma SV: "; cin >> sv->masv;

	//Nhập ngày sinh:
	fflush ( stdin );
	cout << "\n\tNgay sinh: "; cin >> sv->ngsinh.ngay;
	cout << "\n\tThang sinh: "; cin >> sv->ngsinh.thang;
	cout << "\n\tNam sinh: "; cin >> sv->ngsinh.nam;

	//Nhập giới tính:
	cout << "\n\tGioi tinh (Male / Female): ";
	fflush ( stdin );
	fgets ( sv->gioitinh, sizeof( sv->gioitinh ), stdin );
	sv->gioitinh[strlen ( sv->gioitinh ) - 1] = '\0';

	//Nhập điểm:
	fflush ( stdin );
	cout << "\n\tDiem: "; cin >> sv->diem;
}

//Hiển thị thông tin sinh viên:
void Hienthisv ( SV *sv ) {
	cout << "\n\tHo Ten: " << sv->hoten << "(" << sv->masv << ")";
	cout << "\n\tNgay sinh: " << sv->ngsinh.ngay << "-" << sv->ngsinh.thang << "-" << sv->ngsinh.nam;
	cout << "\n\tGioi tinh: " << sv->gioitinh;
	cout << "\n\tDiem: " << sv->diem;
}

//Nhập danh sách:
void Nhapds ( SV *p, int n ) {
	for ( int i = 0; i < n; i++ ) {
		cout << i + 1 << ", Nhap thong tin SV thu " << i + 1 << ":" << endl;
		Nhapsv ( p + i );
	}
}

//Hiển thị danh sách:
void Hienthids ( SV *p, int n ) {
	for ( int i = 0; i < n; i++ ) {
		Hienthisv ( p + i );
		cout << endl;
	}
}

void Sapxep ( SV *p, int n ) {
	for ( int i = 0; i < n; i++ ) {
		for ( int j = i + 1; j < n; j++ ) {
			if ( ( p + i )->diem > ( p + j )->diem ) {
				SV temp = *( p + j );
				*( p + j ) = *( p + i );
				*( p + i ) = temp;
			}
		}
	}
}

int main () {
	SV *p;
	int n;
	do {
		cout << "Nhap so SV: "; cin >> n;
	} while ( n < 0 || n > 100 );
	p = new SV[n];
	cout << "\n==NHAP THONG TIN " << n << " SV==" << endl;
	Nhapds ( p, n );
	cout << "\n==HIEN THI THONG TIN VUA NHAP==" << endl;
	Hienthids ( p, n );
	cout << "\n==DANH SACH DA SAP XEP==" << endl;
	Sapxep ( p, n );
	Hienthids ( p, n );
	delete p;
	system ( "pause" );
	return 0;
}