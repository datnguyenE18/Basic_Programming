#include<iostream>
#include <math.h>

using namespace std;
int So_phan_tu_mang();
void Nhap_Mang(int arr[], int n);
void Xuat_Mang(int arr[], int n);
void SNT(int arr[], int n);

//HAM CHINH (main) :
int main()
{
	int arr[100];
	int n;
	n = So_phan_tu_mang();

	cout << "Nhap gia tri cac phan tu mang: " << endl;
	Nhap_Mang(arr, n);
	
	cout << "Cac phan tu cua Mang la: " ;
	Xuat_Mang(arr, n);
	
	cout << "\nCac SNT la: ";
	SNT(arr, n);
	cout << endl;
	system("pause");
	return 0;
}

//NHAP SO PHAN TU MANG:
int So_phan_tu_mang()
{
	int a;
	do
	{
		cout << "Nhap so phan tu trong mang: "; cin >> a;
	} while (a>100 || a< 0);
	return a;
}

//NHAP MANG:
void Nhap_Mang(int arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << "	arr[" << i << "]= ";
		cin >> arr[i];
	}
}

//XUAT MANG
void Xuat_Mang(int arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << arr[i] << ", ";
	}
}

//Tim SNT:
void SNT(int arr[], int n)
{
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
				if (arr[i] % j == 0)
				{
					KT = false; // cap nhat lai gia su ban dau là False
					break;      // dung viec kiem tra vi da phat hien a[i] khong phai SNT
				}
			}
		}
		// Kiem tra lai gia su ban dau de ket luan:
		if (KT == true)
		{
			cout << arr[i] << ", ";
		}
	}
}