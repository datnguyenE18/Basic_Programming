#include<iostream>
#include<fstream>
#include<string>
using namespace std;

bool nguyento ( int x ) {
	int nguyen_to = 0;
	for ( int i = 1; i <= x; i++ ) {
		if ( x %i == 0 ) {
			nguyen_to += 1;
		}
	}
	if ( nguyen_to == 2 ) {
		return 1;
	}
	if ( nguyen_to != 2 ) {
		return 0;
	}
}
int main () {
	ofstream FileOut;
	int x;
	cout << "\n\t\t============= CHUONG TRINH KIEM TRA SO NGUYEN TO =================\n";
	cout << "Nhap 1 so bat ki: "; cin >> x;
	cout << "\n\t======== Mo file Result.txt len de xem ket qua nhe ========\n\n";
	FileOut.open ( "Result.txt", ios_base::out );
	FileOut << "So ban vua nhap la: " << x;
	if ( nguyento ( x ) == 1 ) {
		FileOut << "\nLa so nguyen to. Vi no chi chia het cho 1 va chinh no";
		return 0;
	}
	if ( nguyento ( x ) == false ) {
		FileOut << "\nKhong phai So nguyen to";
		FileOut << "\nVi " << x << " chia het cho cac so: ";
		for ( int i = 1; i <= x; i++ ) {
			if ( x % i == 0 ) {
				FileOut << i << " ";
			}
		}
	}

	system ( "pause" );
	return 0;
}