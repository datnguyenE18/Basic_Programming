#include<iostream>
using namespace std;
#define MAX 100

int main()
{
	int n;
	int arr[MAX];

	do
	{
		cout << "Nhap so luong phan tu Array n = " ;
		cin >> n;
		if (n < 0 || n > MAX)
		{
			cout << "Ngoai gioi han" << endl;
			system("pause");
		}
	} while (n < 0 || n > MAX);

	cout << endl; 
	cout << "NHAP GIA TRI CAC PHAN TU:" << endl;
	for (int i = 0; i < n; i++)
	{
		cout << "Nhap gia tri phan tu arr[" << i << "] = " ;
		cin >> arr[i];
	}
	cout << endl;
	cout << "In GIA TRI CAC PHAN TU: " << endl;

	for (int i = 0; i < n; i++)
	{
		cout << "arr[" << i << "] = " << arr[i] << endl;
	}
	system("pause");
	return 0;
}