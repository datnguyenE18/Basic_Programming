#include<iostream>
using namespace std;

// hàm nhập mảng
void Nhap_Mang ( int a[], int n ) {
	for ( int i = 0; i < n; i++ ) {
		cout << "\nNhap phan tu a[" << i << "]= ";
		cin >> a[i];
	}
}

// hàm xuất mảng
void Xuat_Mang ( int a[], int n ) {
	for ( int i = 0; i < n; i++ ) {
		cout << a[i] << "  ";
	}
}

// hàm có chức năng xóa phần tử tại vị trí k bất kì 
void Xoa ( int a[], int &n, int vitri ) {
	for ( int i = vitri + 1; i < n; i++ ) {
		a[i - 1] = a[i];
	}
	n--; // số lượng phần tử mảng giảm đi 1
}
int main ( ) {

	int a[100];
	int n;
	cout << "\nNhap so luong phan tu mang: ";
	cin >> n;
	cout << "\n\n\t\t NHAP MANG\n";
	Nhap_Mang ( a, n );
	cout << "\n\n\t\t XUAT MANG\n";
	Xuat_Mang ( a, n );

	int vitri;
	cout << "\nNhap vi tri can xoa: ";
	cin >> vitri;
	Xoa ( a, n, vitri );
	cout << "\n\n\t\t XUAT MANG\n";
	Xuat_Mang ( a, n );
	system ( "pause" );
	return 0;
}