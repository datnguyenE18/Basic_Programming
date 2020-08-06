#include<iostream>
using namespace std;
#define MAX 100

//Nhap so luong Phan Tu:
int Nhap_So_Phan_Tu_Ham()
{
	int n;
	do
	{
		cout << "Nhap so luong phan tu Array n = ";
		cin >> n;
		if (n < 0 || n > MAX)
		{
			cout << "Ngoai gioi han" << endl;
			system("pause");
		}
	} while (n < 0 || n > MAX);
	return n;
}


//Tham so hinh thuc cua ham gom co: mang arr[], so luong phan tu cua mang n
void Nhap_Mang(int arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << "\nNhap phan tu arr[" << i << "]: ";
		cin >> arr[i]; // nhap gia tri cho tung phan tu cua mang - tu arr[0] -> arr[n - 1]
	}
}


// tham so hinh thuc truyen vao cua ham gom co: mang arr[], so luong phan tu cua mang n
void Xuat_Mang(int arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << arr[i] << " "; // xuat gia tri cua tung phan tu ra man hinh console
	}
}

int main()
{
	int n;
	int arr[MAX];
	n = Nhap_So_Phan_Tu_Ham();
	cout << endl;
	cout << "\n\t\t NHAP MANG\n";
	Nhap_Mang(arr, n); // goi lai ham nhap mang - ham co tac dung nhap gia tri cho tung phan tu cua mang
	cout << "\n\t\t XUAT MANG\n";
	Xuat_Mang(arr, n); // goi lai ham xuat mang - ham co tac dung xuat tat ca cac gia tri cua tung phan tu trong mang
	system("pause");
	return 0;
}