#include<iostream>
using namespace std;
#include<fstream>

// hàm đọc dữ liệu từ file
void Doc_File ( int a[], int &n, ifstream &filein ) {
	while ( filein.eof () == false ) {
		filein >> a[n];
		char x;
		filein >> x;
		n++;
	}
}
// hàm xuất mảng
void Xuat_Mang ( int a[], int n ) {
	for ( int i = 0; i < n; i++ ) {
		cout << a[i] << "  ";
	}
}

// tìm ucln của 2 số nguyên
int Tim_UCLN ( int x, int y ) {
	while ( x != y ) {
		if ( x > y ) {
			x = x - y;
		} else if ( x < y ) {
			y = y - x;
		}
	}
	return x;
}

// hàm tìm bcnn của 2 số nguyên
int Tim_BCNN ( int x, int y ) {
	return ( x * y ) / Tim_UCLN ( x, y );
}

// hàm tìm UCLN của tất cả các phần tử trong mảng
int Tim_UCLN_Mang ( int a[], int n ) {
	int x = a[0];
	for ( int i = 1; i < n; i++ ) {
		x = Tim_UCLN ( x, a[i] );
	}
	return x;
}

// hàm tìm BCNN của tất cả các phần tử trong mảng
int Tim_BCNN_Mang ( int a[], int n ) {
	int x = a[0];
	for ( int i = 1; i < n; i++ ) {
		x = Tim_BCNN ( x, a[i] );
	}
	return x;
}

int main () {
	ifstream filein;
	filein.open ( "input.txt", ios_base::in );
	int a[100];
	int n = 0;
	Doc_File ( a, n, filein );
	cout << "\n\n\t\t DAY SO NGUYEN\n";
	Xuat_Mang ( a, n );

	ofstream fileout;
	fileout.open ( "UCLN.txt", ios_base::out );
	fileout << Tim_UCLN_Mang ( a, n );
	fileout.close ();

	fileout.open ( "BCNN.txt", ios_base::out );
	fileout << Tim_BCNN_Mang ( a, n );

	filein.close ();
	system ( "pause" );
	return 0;
}