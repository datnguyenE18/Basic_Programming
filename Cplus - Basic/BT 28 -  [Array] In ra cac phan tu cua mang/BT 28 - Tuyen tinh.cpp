#include<iostream>
using namespace std;

int main()
{
	int a[5] ;
	for (int i = 0; i <=4; i++)
	{
		cout << "Nhap phan tu a[" << i << "] = :";
		cin >> a[i];
	}

	cout << "Cac phan tu cua mang la: " ;

	for (int i = 0; i <= 4; i++)
	{
		cout << a[i] <<" ";
	}
	cout << endl;
	system("pause");
	return 0;
}
