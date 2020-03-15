#include <iostream>
using namespace std;

// Tìm UCLN bằng Thuật toán Euclid
//(Khử đệ quy) :
long long GCD ( long long a, long long b ) {
	while ( b != 0 ) {
		long r = a % b;
		a = b; b = r;
	}
	return a;
}

/* Hoặc Đệ quy:
	long long GCD(long long a, long long b){
		if (a == 0) return b;
		return GCD(b % a, a);
	}
*/

// Tìm BCNN = (a*b) / GCD(a,b)
long long LCM ( long long a, long long b ) {
	return ( a*b ) / GCD ( a, b );
}

int main () {
	long long a, b;
	cin >> a >> b;
	cout << "UCLN: " << GCD ( a, b ) << endl;
	cout << "BCNN: " << LCM ( a, b ) << endl;

	system ( "pause" );
	return 0;
}

