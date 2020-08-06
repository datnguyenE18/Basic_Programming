#include <iostream>
using namespace std;

int main ( void ) {
	int A[] = { 9, 7, 12, 8, 6, 5 }, n = 6;
	int *P; //Khai báo P là con trỏ kiểu int

	for ( int i = 0; i < n; i++ ) {//Xử lý mảng như con trỏ
		cout << "\nDia chi A[" << i << "]=\t" << ( A + i );
		cout << "\nGia tri A[" << i << "]=\t" << *( A + i ) << endl;
	}

	P = A; // P trỏ đến A và xử lý P như mảng
	for ( int i = 0; i < n; i++ ) {
		cout << "\nDia chi A[" << i << "]=\t" << &P[i];
		cout << "\nGia tri A[" << i << "]=\t" << P[i] << endl;
	}

	system ( "PAUSE" );
	return 0;
}