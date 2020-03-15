#include<bits/stdc++.h>
using namespace std;

int main () {
	stack <int> a; // Khai báo ngăn xếp dạng số nguyên 

	a.push ( 2 ); // push(i); Thêm phần tử i trên ngăn xếp
	a.push ( 3 ); // Thêm một phần tử khác trên ngăn xếp

	cout << a.top () << endl; // a.top(); Truy xuất giá trị của phần tử đầu tiên ở đỉnh của ngăn xếp

	a.pop (); // Xóa phần tử trên đỉnh ngăn xếp 
	cout << a.top () << endl;

	if ( a.empty () ) { //Kiểm tra ngăn xếp có trống không. Nếu trống -> trả về "-1". Nếu đầy (không trống) -> trả về "0"
		cout << "Empty" << endl;
	} else cout << "Full" << endl;

	cout << a.size () << endl; // Lấy số lượng phần tử đang có trong ngăn xếp

	system ( "pause" );
	return 0;
}