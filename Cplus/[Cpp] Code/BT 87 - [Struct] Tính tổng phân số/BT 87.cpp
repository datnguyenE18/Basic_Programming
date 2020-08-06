#include<bits/stdc++.h>
using namespace std;

int UCLN ( int a, int b ) {
	if ( a == 0 ) return b;
	return UCLN ( b % a, a );
}

int BCNN ( int a, int b ) {
	return ( a * b ) / UCLN ( a, b );
}

typedef struct PhanSo {
	int ts, ms;
} PS;

PS rutGon ( PS x ) {
	PS y;
	y.ts = x.ts / UCLN ( x.ts, x.ms );
	y.ms = x.ms / UCLN ( x.ts, x.ms );
	return y;
}

PS cong ( PS x, PS y ) { // Phép trừ, nhân, chia tương tự
	PS z;
	z.ts = x.ts * y.ms + x.ms * y.ts;
	z.ms = x.ms * y.ms;
	z = rutGon ( z );
	return z;
}

void Xuat ( PS x ) {
	cout << x.ts << "/" << x.ms;
}

int main () {
	PS x, y;
	cout << "Nhap Tu So va Mau So cua X: "; cin >> x.ts >> x.ms;
	cout << "Nhap Tu So va Mau So cua Y: "; cin >> y.ts >> y.ms;
	cout << "Da rut gon: ";
	cout << "\n\t\tX: "; Xuat ( rutGon ( x ) );
	cout << "\n\t\tY: "; Xuat ( rutGon ( y ) );
	cout << "\nTong X + Y ="; Xuat ( cong ( x, y ) ); cout << endl;
	system ( "pause" );
}
