#include<bits/stdc++.h>
using namespace std;

struct person {
	int age;
	float weight;
};

int main () {
	struct person *personPtr, person1;
	personPtr = &person1; //địa chỉ của biến person1 được lưu giữ bởi con trỏ personPtr
	cout << "Nhap tuoi: "; cin >> personPtr->age;
	cout << "Nhap can nang: "; cin >> personPtr->weight;
	cout << "Displaying: \n";
	cout << "Tuoi: " << personPtr->age;
	cout << "\nCan nang: " << personPtr->weight;

	system ( "pause" );
}