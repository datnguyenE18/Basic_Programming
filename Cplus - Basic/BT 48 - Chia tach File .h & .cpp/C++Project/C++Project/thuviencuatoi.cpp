#include"thuviencuatoi.h" // gọi lại thư viện bên file .h

// định nghĩa hàm kiểm tra số nguyên tố
// trả về true nếu n là số nguyên tố
bool Kiem_Tra_So_Nguyen_To ( int n ) {
	if ( n < 2 ) {
		return false;
	} else {
		if ( n == 2 ) {
			return true;
		} else {
			if ( n % 2 == 0 ) {
				return false;
			} else {
				for ( int i = 2; i < n; i++ ) {
					if ( n % i == 0 ) {
						return false;
					}
				}
			}
		}
	}
	return true;
}

// định nghĩa hàm giải phương trình bậc 2 
// ax^2 + bx + c = 0
void Giai_Phuong_Trinh_Bac_2 ( float a, float b, float c ) {
	if ( a == 0 ) {
		if ( b == 0 ) {
			if ( c == 0 ) {
				cout << "\nPhuong trinh co vo so nghiem";
			} else {
				cout << "\nPhuong trinh vo nghiem";
			}
		} else {
			cout << "\nPhuong co nghiem: " << -c / b;
		}
	} else {
		float delta = ( b * b ) - ( 4 * a * c );
		if ( delta == 0 ) {
			cout << "\nPhuong trinh co nghiem kep: " << -b / ( 2 * a );
		} else if ( delta < 0 ) {
			cout << "\nPhuong trinh vo nghiem";
		} else {
			cout << "\nPhuong trinh co 2 nghiem phan biet: ";
			cout << "\nx1 = " << ( -b + sqrt ( delta ) ) / ( 2 * a );
			cout << "\nx2 = " << ( -b - sqrt ( delta ) ) / ( 2 * a );
		}

	}
}

// định nghĩa hàm kiểm tra số hoàn thiện
bool Kiem_Tra_So_Hoan_Thien ( int n ) {
	int sum = 1;
	for ( int i = 2; i < n; i++ ) {
		if ( n % i == 0 ) {
			sum += i;
		}
	}
	if ( sum == n ) {
		return true;
	}
	return false;
}