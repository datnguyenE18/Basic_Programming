#include<iostream>
using namespace std;

int main()
{
	int arr[100];
	int n;
	
	//NHAP SO PHAN TU :

	do
	{
		cout << "Nhap so phan tu: "; cin >> n;
	} while (n>100 || n<0);

	cout << "Nhap cac phan tu: ";
	//NHAP CAC PHAN TU 
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i]; cout << " ";
	}
	cout << endl;

	//IN CAC PHAN TU:
	for (int i = 0; i < n; i++)
	{
		cout << arr[i] << " ";
	}

	system("pause");
	return 0;
}