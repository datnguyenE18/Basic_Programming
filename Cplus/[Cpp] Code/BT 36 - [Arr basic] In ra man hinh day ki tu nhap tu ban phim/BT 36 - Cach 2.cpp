#include<iostream>
using namespace std;

int main()
{
	char a[10000];
	cout << "Nhap day ky tu:";
	cin.getline(a,20); // de 20 hoac 10000 deu duoc
	cout << a << endl;

	system("pause");
	return 0;
}
