#include <iostream>
using namespace std;

int main ( void ) {
	int a = 20, b = 10;// biến a có giá trị là 20, b là 10
	int *p; //khai báo p là con trỏ kiểu int

	p = &a; //p trỏ dến dịa chỉ ô nhớ dành cho a.
	cout << "\nDia chi p=" << p << " Dia chi a:" << &a << endl;
	cout << "\nGia tri p=" << *p << " Gia tri a:" << a << endl;

	*p = *p + b; //thay đổi gián tiếp nội dung cuả a
	cout << "\nGia tri p=" << *p << " Gia tri a:" << a << endl;

	p = &b; //bây giờ p lại trỏ đến b
	cout << "\nDia chi p=" << p << " Dia chi b:" << &b << endl;
	cout << "\nGia tri p=" << *p << " Gia tri b:" << b << endl;

	*p = *p + 10; //thay đổi gián tiếp nội dung cuả b
	cout << "\nGia tri p=" << *p << " Gia tri b:" << b << endl;

	p = new int; //lúc này p lại trỏ đến ô nhở mới
	*p = 100; //thiết lập nội dung ô nhớ là 100
	cout << "\nDia chi p=" << p << " Gia tri p:" << *p << endl;

	delete p; //giải phóng ô nhớ p trỏ đến
	system ( "PAUSE" );
	return 0;
}