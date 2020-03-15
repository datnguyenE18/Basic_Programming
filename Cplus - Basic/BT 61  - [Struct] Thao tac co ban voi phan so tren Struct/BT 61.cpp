#include<bits\stdc++.h>
using namespace std;

// Khai báo struct phân số
struct phanso {
	int TS;
	int MS;
};
typedef struct phanso PHANSO;

// Hàm nhập phân số
void nhap_ps ( PHANSO &ps ) {
	cout << "\t\tNhap Tu So: "; cin >> ps.TS;
	cout << "\n\t\tNhap Mau So: "; cin >> ps.MS;
}

// Hàm xuất phân số
void xuat_ps ( PHANSO ps ) {
	cout << "\t" << ps.TS << "/" << ps.MS;
}

//Khai báo struct Danh sách (struct này chứa nhiều phân số)
struct danhsach {
	PHANSO *arr; // Khai báo mảng động chứa phân số
	int n; // số lượng phân số (Số lượng phần tử trong mảng arr)
};
typedef struct danhsach DANHSACH;

// Hàm nhập danh sách phân số
void nhap_ds ( DANHSACH &ds ) {
	for ( int i = 0; i < ds.n; i++ ) {
		// Gọi lại hàm nhập phân số để nhập giá trị cho phần tử
		cout << "+) Nhap phan so thu " << i + 1 << endl;
		nhap_ps ( ds.arr[i] );
	}
}

// Hàm xuất danh sách phân số
void xuat_ds ( DANHSACH ds ) {
	for ( int i = 0; i < ds.n; i++ ) {
		// Gọi lại hàm xuất phân số để xuất giá trị cho phần tử
		xuat_ps ( ds.arr[i] ); cout << "; ";
	}
	cout << endl;
}

//Hàm tìm UCLN
int UCLN ( int x, int y ) {
	if ( x < 0 ) {
		x *= -1;
	}
	if ( y < 0 ) {
		y *= -1;
	}

	while ( x != y ) {
		if ( x > y ) {
			x = x - y;
		} else {
			y = y - x;
		}
	}
	return x;
}

// hàm rút gọn 1 phân số
void rut_gon ( PHANSO &x ) {
	int ucln = UCLN ( x.TS, x.MS );
	x.TS = x.TS / ucln;
	x.MS = x.MS / ucln;
}

// hàm rút gọn tất cả các phân số
void rut_gon_ds ( DANHSACH &ds ) {
	for ( int i = 0; i < ds.n; i++ ) {
		rut_gon ( ds.arr[i] );
	}
}

// hàm tính tổng 2 phân số
PHANSO Tinh_Tong_2_Phan_So ( PHANSO x, PHANSO y ) {
	PHANSO ketqua;
	if ( x.MS != y.MS ) {
		ketqua.TS = ( x.TS * y.MS ) + ( y.TS * x.MS );
		ketqua.MS = x.MS * y.MS;
	} else {
		ketqua.TS = x.TS + y.TS;
		ketqua.MS = x.MS;
	}
	return ketqua;
}

// hàm tính tổng tất cả các phân số
PHANSO Tinh_Tong_Tat_Ca_Phan_So ( DANHSACH ds ) {

	PHANSO ketqua = ds.arr[0];
	/*ketqua.TS = ds.arr[0].TS;
	ketqua.MS = ds.arr[0].MS;*/

	for ( int i = 1; i < ds.n; i++ ) {
		ketqua = Tinh_Tong_2_Phan_So ( ketqua, ds.arr[i] );
	}

	return ketqua;
}


int main () {
	DANHSACH ds; //khai báo struct danh sách phân số
	cout << "\nNhap so luong phan so: "; cin >> ds.n;
	ds.arr = new PHANSO[ds.n]; 	//Cấp phát mảng động

	// Nhập xuất danh sách phân số
	cout << "\n\n\t\tNHAP DANH SACH PHAN SO\n";
	nhap_ds ( ds );
	cout << "\n\n\t\tDANH SACH PHAN SO\n";
	xuat_ds ( ds );

	//Xuất danh sách phân số đã rút gọn
	rut_gon_ds ( ds );
	cout << "DANH SACH PHAN SO DA RUT GON\n";
	xuat_ds ( ds );

	cout << "\n\n\n\t\t TONG TAT CA CAC PHAN SO\n";
	PHANSO ketqua;
	ketqua = Tinh_Tong_Tat_Ca_Phan_So ( ds );
	rut_gon ( ketqua );
	xuat_ps ( ketqua );
	cout << endl;

	system ( "pause" );
	return 0;
}