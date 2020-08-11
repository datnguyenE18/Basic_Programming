#include<bits/stdc++.h>
using namespace std;

int main() {
	int *ptr;
	ptr = new int[10]; // cấp phát 1 vùng nhớ có 10 ô int liên tiếp nhau và cho ptr trỏ vào đầu ô nhớ đấy

	for ( int i = 0; i < 10; i++ )
		ptr[i] = i; // dùng ptr như một mảng

	// In ra mảng:
	for ( int i = 0; i < 10; i++ )
		cout << ptr[i] << ", ";

	// CÁCH 2:
	cout << endl;
	for ( int i = 0; i < 10; i++ ) {
		cout << *ptr << ", ";
		ptr++; // chuyển ptr sang ô nhớ tiếp theo liền kề
	}

	//Nếu In ra mảng theo cách 2 này thì trước khi muốn delete ta phải:
	ptr -= 10;

	delete ptr; // thu hồi vùng nhớ do ptr trỏ vào
}

/*
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*/