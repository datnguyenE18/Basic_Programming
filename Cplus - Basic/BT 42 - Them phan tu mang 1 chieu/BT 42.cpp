#include<iostream>
using namespace std;

// nhập mảng
void Nhap_Mang ( int a[], int n ) {
	for ( int i = 0; i < n; i++ ) {
		cout << "\nNhap gia tri a[" << i << "]= ";
		cin >> a[i];
	}
}

// xuất mảng
void Xuat_Mang ( int a[], int n ) {
	for ( int i = 0; i < n; i++ ) {
		cout << a[i] << " ";
	}
}

// hàm có nhiệm vụ thêm 1 phần tử x vào vị trí k bất kì trong mảng
void Them ( int a[], int &n, int x, int k ) {
	for ( int i = n - 1; i >= k; i-- ) {
		a[i + 1] = a[i];
	}
	a[k] = x; // gán phần tử cần thêm x vào chính vị trí k
	n++; // số lượng phần tử mảng tăng lên 1 đơn vị
}

int main ( ) {
	int a[100];
	int n;

	do {
		cout << "\nNhap so luong phan tu mang: ";
		cin >> n;
		if ( n <= 0 || n > 100 ) {
			cout << "\nSo luong phan tu mang khong hop le";
			system ( "pause" );
		}
	} while ( n <= 0 || n > 100 );

	cout << "\n\n\t\t NHAP MANG\n";
	Nhap_Mang ( a, n );
	cout << "\n\n\t\t XUAT MANG\n";
	Xuat_Mang ( a, n );

	int x; // giá trị cần thêm vào mảng
	cout << "\nNhap gia tri can them: ";
	cin >> x;
	int vitri;
	cout << "\nNhap vi tri can them: ";
	cin >> vitri;

	Them ( a, n, x, vitri ); // gọi lại hàm thêm để thêm 1 phần tử x vào vị trí 
	cout << "\n\n\t\t XUAT MANG SAU KHI THEM\n";
	Xuat_Mang ( a, n );

	system ( "pause" );
	return 0;
}