#include<bits/stdc++.h>
using namespace std;

void NhapMang ( int M[], int n ) {
	srand ( time ( NULL ) );
	for ( int i = 0; i < n; i++ )
		M[i] = rand () % 100;
}

void XuatMang ( int M[], int n ) {
	for ( int i = 0; i < n; i++ )
		cout << M[i] << "\t";
}

int main () {
	cout << "Nhap so luong phan tu mang: ";
	int n; cin >> n;
	int M[n];
	NhapMang ( M, n );
	cout << "Mang ngau nhien: \n";
	XuatMang ( M, n );
	
	system ( "pause" );
	return 0;
}