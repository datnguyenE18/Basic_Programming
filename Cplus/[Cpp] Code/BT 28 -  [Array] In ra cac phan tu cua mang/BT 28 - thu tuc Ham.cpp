#include<iostream>
using namespace std;

void Nhap_mang(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << "Nhap phan tu a[" << i << "] = ";
		cin >> a[i];
	}
}

int main()
{
	int a[5];
	Nhap_mang(a , 5);
	cout << "Cac phan tu cua mang la: ";
	for (int i = 0; i <= 4; i++)
	{
		cout << a[i] << " ";
	}
	cout << endl;
	system("pause");
	return 0;
}
