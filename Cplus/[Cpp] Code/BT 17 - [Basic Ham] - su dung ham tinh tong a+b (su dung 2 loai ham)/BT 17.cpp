#include <iostream>
using namespace std;

//Ham in ra man hinh (ham khong co gia tri tra ve)
void Thong_Bao ()
{
	cout << "=== Chuong trinh tinh tong hai so ===" << endl;
} 

//Ham tinh tong (ham co gia tri tra ve):
int Tinh_Tong( int a, int b)
{
	return ( a + b );
}

int main()
{
	Thong_Bao ();
	int s, c, d;
	cout << "Nhap c,d: ";
	cin >> c >> d;
	s = Tinh_Tong(c, d);
	cout << "Tong la : " << s << endl;
	system("pause");
	return 0;
}
