#include<bits\stdc++.h>
using namespace std;

int binary_sys ( int &N ) {
	int sum = 0, i = 1, du;
	while ( N > 0 ) {
		du = N % 2;
		sum = sum + ( i * du );
		N = N / 2;
		i = i * 10;
	}
	return sum;
}

void phan_tich_SNT ( int N ) {
	int dem;

	for ( int i = 2; i <= N; i++ ) {
		dem = 0;
		while ( N % i == 0 ) {
			dem++;
			N /= i;
		}
		if ( dem ) {
			cout << i;
			if ( dem > 1 ) cout << "^" << dem;
			if ( N > i ) cout << " * ";
		}
	}
	cout << endl;
}

void menu ( int N ) {
	int selec;
	while ( true ) {
		system ( "cls" );
		cout << "\n\t\t=============== MENU==============";
		cout << "\n1) Bieu dien N thanh He nhi phan (Binary system)";
		cout << "\n2) Phan tich N thanh tich cac thua SNT ";
		cout << "\n0) End!";
		cout << "===============================================================================" << endl;

		cout << "\Nhap lua chon: "; cin >> selec;

		switch ( selec ) {
			case 0:{
					   return; // kết thúc hàm 
			}break;

			case 1:{
					   cout << "Nhap N: "; cin >> N;
					   cout << "CHUYEN SANG HE NHI PHAN: " << binary_sys ( N ) << endl;
					   system ( "pause" );
			} break;

			case 2: {
						cout << "Nhap N: "; cin >> N; cout << "=";
						phan_tich_SNT ( N );
						system ( "pause" );
			} break;

			default: {
						 cout << "Khong co san!" << endl;
						 system ( "pause" );
			}break;
		}
	}
}

int main () {
	int N = 0;
	menu ( N );

	system ( "pause" );
	return 0;
}