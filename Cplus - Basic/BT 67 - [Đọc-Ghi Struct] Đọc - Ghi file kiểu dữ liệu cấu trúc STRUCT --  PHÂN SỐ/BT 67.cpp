#include<iostream>
using namespace std;
#include<fstream>

// khai báo cấu trúc phân số
struct PHANSO {
	int tuso;
	int mauso;
};

// khai báo cấu trúc danh sách phân số
struct DANHSACH {
	PHANSO ds_ps[100];
	int n;
};


// hàm đọc 1 phân số
void Doc_1_Phan_So ( PHANSO &ps, ifstream &filein ) {
	filein >> ps.tuso;
	char x;
	filein >> x;
	filein >> ps.mauso;
}

// hàm đọc file
void Doc_File ( DANHSACH &ds, ifstream &filein ) {
	filein >> ds.n;
	for ( int i = 0; i < ds.n; i++ ) {
		Doc_1_Phan_So ( ds.ds_ps[i], filein );
	}
}

// hàm xuất danh sách phân số
void Xuat_Danh_Sach_Phan_So ( DANHSACH ds ) {
	for ( int i = 0; i < ds.n; i++ ) {
		cout << ds.ds_ps[i].tuso << "/" << ds.ds_ps[i].mauso << endl;
	}
}

// hàm tìm UCLN
int Tim_UCLN ( int x, int y ) {
	while ( x != y ) {
		if ( x < y ) {
			y = y - x;
		} else if ( x > y ) {
			x = x - y;
		}
	}
	return y;
}

// hàm rút gọn 1 phân số
void Rut_Gon_1_Phan_So ( PHANSO &ps ) {
	int ucln = Tim_UCLN ( ps.tuso, ps.mauso );
	ps.tuso = ps.tuso / ucln;
	ps.mauso = ps.mauso / ucln;
}

// hàm rút gọn danh sách phân số và ghi vào file RUTGONPHANSO.TXT
void Ghi_File_Rut_Gon_Danh_Sach_Phan_So ( DANHSACH &ds, ofstream &fileout ) {
	for ( int i = 0; i < ds.n; i++ ) {
		Rut_Gon_1_Phan_So ( ds.ds_ps[i] );
	}

	fileout.open ( "RUTGONPHANSO.TXT", ios_base::out );
	fileout << ds.n << endl;
	for ( int i = 0; i < ds.n; i++ ) {
		fileout << ds.ds_ps[i].tuso << "/" << ds.ds_ps[i].mauso << endl;
	}
	fileout.close ();
}

// tìm phân số lớn nhất và ghi vào file OUTPUT.TXT
void Ghi_File_Max ( DANHSACH ds, ofstream &fileout ) {
	fileout.open ( "OUTPUT.TXT", ios_base::out );
	float max = ds.ds_ps[0].tuso / ( ds.ds_ps[0].mauso * 1.0 );
	int k = 0; // lưu lại chỉ số của phân số lớn nhất
	for ( int i = 1; i < ds.n; i++ ) {
		float tam = ds.ds_ps[i].tuso / ( ds.ds_ps[i].mauso * 1.0 );
		if ( max < tam ) {
			max = tam;
			k = i;
		}
	}
	fileout << ds.ds_ps[k].tuso << "/" << ds.ds_ps[k].mauso;
	fileout.close ();
}
int main () {
	ifstream filein;
	filein.open ( "INPUT.TXT", ios_base::in );
	DANHSACH ds;

	Doc_File ( ds, filein );
	Xuat_Danh_Sach_Phan_So ( ds );
	ofstream fileout;
	Ghi_File_Rut_Gon_Danh_Sach_Phan_So ( ds, fileout );

	Ghi_File_Max ( ds, fileout );
	filein.close ();
	system ( "pause" );
	return 0;
}