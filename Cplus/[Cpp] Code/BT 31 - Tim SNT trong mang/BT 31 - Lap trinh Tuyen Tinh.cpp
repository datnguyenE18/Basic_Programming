#include<iostream>
#include <math.h>

using namespace std;

int main()
{
	int arr[100];
	int n;

	//NHAP SO PHAN TU MANG:
	do
	{
		cout << "Nhap so phan tu trong mang: "; 	cin >> n;
	} while (n>100 || n< 0);

	cout << "Nhap gia tri cac phan tu mang: " << endl;

	//NHAP MANG:
	for (int i = 0; i < n; i++)
	{
		cout << "	arr[" << i << "]= ";
		cin >> arr[i];
	}

	cout << "Cac phan tu cua Mang la: " ;

	//XUAT MANG
	for (int i = 0; i < n; i++)
	{
		cout << arr[i] << ", ";
	}
	
	cout << "\nCac SNT la: ";

	// TIM SNT TRONG MANG:
	for (int i = 0; i < n; i++)
	{
		bool KT = true; // Gia su a[i] la SNT
		// Di kiem tra Gia su tren
		if (arr[i] < 2)
		{
			KT = false; // cap nhat lai gia su ban dau là False
		}
		else
		{
			for (int j = 2; j < arr[i]; j++)
			{
				if (arr[i] % j ==0)
				{
					KT = false; // cap nhat lai gia su ban dau là False
					break;      // dung viec kiem tra vi da phat hien a[i] khong phai SNT
				}
			}
		}
		// Kiem tra lai gia su ban dau de ket luan:
		if (KT == true)
		{
			cout << arr[i] << "  ";
		}
	}
	system("pause");
	return 0;
}