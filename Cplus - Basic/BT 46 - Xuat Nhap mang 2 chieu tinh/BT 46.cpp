#include<iostream>
using namespace std;
#define MAX_DONG 100
#define MAX_COT 100

// khai báo và khởi tạo mảng 2 chiều các số nguyên


// hàm nhập mảng 2 chiều
void Nhap_Mang_2_Chieu ( int a[][MAX_COT]/*Chỉ cần chỉ số cột máy sẽ suy ra chỉ số dòng*/ , int dong, int cot ) {
	// điều khiển chỉ số dòng
	for ( int i = 0; i < dong; i++ ) {
		// điều khiển chỉ số cột
		for ( int j = 0; j < cot; j++ ) {
			cout << "\nNhap phan tu a[" << i << "][" << j << "] = ";
			cin >> a[i][j]; // nhập phần tử tại dòng thứ i và cột thứ j
		}
	}
}

// hàm xuất mảng 2 chiều
void Xuat_Mang_2_Chieu ( int a[][MAX_COT], int dong, int cot ) {
	// điều khiển chỉ số dòng
	for ( int i = 0; i < dong; i++ ) {
		// điều khiển chỉ số cột
		for ( int j = 0; j < cot; j++ ) {
			cout << a[i][j] << "  ";
		}
		cout << endl;
	}
}


int main ( ) {
	// ========== KHỞI TẠO MẶC ĐỊNH ==========
	// CÁCH 1: khai báo mảng 2 chiều có 4 dòng và 3 cột
	//int a[4][3] = { {1, 2, 3 }, { 4, 5, 6 }, { 6, 7, 5 }, {2, 8, 9} };
	// CÁCH 2: khai báo mảng 2 chiều có 4 dòng và 3 cột
	//int a[4][3] = { 1, 2, 3, 4, 5, 6, 6, 7, 5, 2, 8, 9 };
	// CÁCH 3: khai báo mảng 2 chiều có 4 dòng và 3 cột
	//int a[][3] = { 1, 2, 3, 4, 5, 6, 6, 7, 5, 2};
	// xuất các phần tử ra màn hình
	// vòng lặp điều khiển chỉ số dòng
	//for (int i = 0; i < 4; i++)
	//{
	//	// vòng lặp điều khiển chỉ số cột
	//	for (int j = 0; j < 3; j++)
	//	{
	//		cout << a[i][j] << " ";
	//	}
	//	cout << endl;
	//}

	// ========== KHỞI TẠO GIÁ TRỊ CHO MẢNG 2 CHIỀU BẰNG CÁCH CHO NGƯỜI DÙNG NHẬP VÀO TỪ BÀN PHÍM ==========

	// khai báo mảng 2 chiều chứa tối đa MAX_DONG X MAX_COT phần tử
	int a[MAX_DONG][MAX_COT];
	int dong;
	int cot;

	// kiểm tra số dòng
	do {
		cout << "\nNhap vao so dong: ";
		cin >> dong;
		if ( dong <= 0 || dong > MAX_DONG ) {
			cout << "\nSo dong phai nam trong [1, " << ", " << MAX_DONG << "]";
		}
	} while ( dong <= 0 || dong > MAX_DONG );

	// kiểm tra cột
	do {
		cout << "\nNhap vao so cot: ";
		cin >> cot;
		if ( cot <= 0 || cot > MAX_COT ) {
			cout << "\nSo cot phai nam trong [1, " << ", " << MAX_COT << "]";
		}
	} while ( cot <= 0 || cot > MAX_COT );

	cout << "\n\n\t\t NHAP GIA TRI CHO MANG 2 CHIEU\n";
	Nhap_Mang_2_Chieu ( a, dong, cot );
	cout << "\n\n\t\t MANG 2 CHIEU\n";
	Xuat_Mang_2_Chieu ( a, dong, cot );

	system ( "pause" );
	return 0;
}