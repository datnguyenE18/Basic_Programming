#include<bits/stdc++.h>
using namespace std;

// Hàm tính tổng tích hai đường chéo
int sum ( vector<vector<int>> arr ) {
	int left = 0, right = 0, j = arr.size () - 1; // arr.size (); : Số hàng
	for ( int i = 0; i < arr[0].size (); i++ ) { // arr[0].size (); : Số cột
		left += arr[i][i];
		right += arr[i][j];
		j--;
	} return abs ( left + right );
}

//Hàm nhập mảng 2 chiều:
void Nhap_mang ( vector<vector<int>> &arr ) {
	int hang, cot;

	cout << "Nhap so Hang: "; cin >> hang;
	arr.resize ( hang );

	cout << "Nhap so Cot: "; cin >> cot;
	cout << "\n+) Nhap mang: \n" << endl;
	for ( int i = 0; i < hang; i++ ) {
		arr[i].resize ( cot );
		for ( int j = 0; j < cot; j++ ) cin >> arr[i][j];
	}
}

//Hàm xuất mảng 2 chiều:
void Xuat_mang ( vector<vector<int>> arr ) {
	cout << "\n+) Mang da nhap: \n" << endl;
	int hang = arr.size (); // số hàng
	for ( int i = 0; i < hang; i++ ) {
		int cot = arr[i].size (); // số theo từng hàng
		for ( int j = 0; j < cot; j++ ) cout << setw ( 3 ) << arr[i][j]; // setw(n): tạo n khoảng trống
		cout << endl;
	}
}

int main () {
	vector<vector<int>> arr;
	Nhap_mang ( arr );
	Xuat_mang ( arr );
	if ( arr.size () == arr[0].size () ) cout << "\nTong hai duong cheo: " << sum ( arr ) << endl;
	else {
		system ( "pause" );
		return 0;
	} system ( "pause" );
}