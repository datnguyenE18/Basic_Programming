#include <iostream>
#include <math.h>

using namespace std;
#define MAX 1000

//SO PHAN TU MANG:
int So_phan_tu()
{
	int n;
	cout << "Nhap so phan tu mang: ";
	cin >> n;
	if (n<=0)
	{
		cout << "Ngoai gioi han" << endl;
	}
	else
	{
		return n;
	}

}

//NHAP CAC PHAN TU CUA MANG:
void nhap_mang(int arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << "arr[" << i << "] = " ;
		cin >> arr[i];
	}
}

//XUAT CAC PHAN TU:
void xuat_mang(int arr[], int n)
{
	for (int i = 0; i < n ; i++)
	{
		cout <<arr[i] << " ";
	}
}

//HAM TINH TONG:
int Tinh_tong(int arr[], int n)
{
	int tong = 0;
	for (int i = 0; i < n; i++)
	{
		tong += arr[i];
	}
	return tong;
}

int main()
{
	int n;
	int arr[MAX];
	n = So_phan_tu();
	cout << "\nNhap cac phan tu: " << endl;
	nhap_mang(arr, n);
	cout << "\nCac phan tu cua mang: " << endl;
	xuat_mang(arr, n);
	cout << "\n\nTong cac phan tu la: " << Tinh_tong(arr, n) << endl;
	system("pause");
	return 0;
}