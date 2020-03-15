#include <iostream>
using namespace std;

void Hoan_Vi(int &a, int &b) //Tham bien - Tham chieu
{
	int temp = a;
	a = b;
	b = temp;
	cout << "Gia tri a trong Hoan_Vi la: " << a << endl;
	cout << "Gia tri b trong Hoan_Vi la: " << b << endl;

}

int main()
{
	int c, d;
	cout << "Nhap c: "; cin >> c;
	cout << "Nhap d: "; cin >> d;
	Hoan_Vi(c, d);
	cout << "Gia tri c trong Main la: " << c << endl;
	cout << "Gia tri d trong Main la: " << d << endl;
	
	system("pause");
	return 0;
}

/*Chay thu ta co the thay Hoan Vi co tac dung trong ham Main. Nhu vay mot so bai toan can doi cho a va b de tinh trong ham khac se co tac dung*/
