#include<iostream>
using namespace std;

// NHAP MANG:
void Nhap_Mang(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << "\nNhap phan tu a[" << i << "] = ";
		cin >> a[i];
	}
}

// XUAT MANG:
void Xuat_Mang(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << a[i] << " ";
	}
}

// SNT:
void Xuat_Cac_So_Nguyen_To(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		// dung bien KT lam CO HIEU
		bool KT = true; //Gia su a[i] là SNT
		// Kiem tra Gia Su
		if (a[i] < 2)
		{
			KT = false;
		}
		else
		{
			for (int j = 2; j < a[i]; j++)
			{
				if (a[i] % j == 0)
				{
					KT = false; // Cap nhat lai gia su ban dau là False
					break; // dung Kiem tra vi da phat hien a[i] khong phai SNT
				}
			}
		}

		// Kiem tra lai và Ket luan
		if (KT == true)
		{
			cout << a[i] << "  ";
		}
	}
}

// So Sieu NT
void Xuat_Cac_So_Sieu_Nguyen_To(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		int tam = a[i]; // Cho bien "tam" giu gia tri a[i]
		bool KT = true; // Gia su a[i] là so Sieu NT
		// Kiem tra so Sieu NT
		while (tam != 0)
		{
			// dung bien KT lam CO HIEU
			KT = true; // ...Gia su "tam" <=> a[i] là so Sieu NT
			// ÐI KI?M TRA CÁI GI? S?
			if (tam < 2)
			{
				KT = false;
			}
			else
			{
				for (int j = 2; j < tam; j++)
				{
					if (tam % j == 0)
					{
						KT = false; // Cap nhat lai gia su ban dau là False
						break; // dung Kiem tra vi da phat hien a[i] khong phai so Sieu nguyen to
					}
				}
			}

			// Kiem tra lai và Ket luan
			if (KT == true)
			{
				tam = tam / 10; 
			}
			else
			{
				break; 
			}
		}

 
		if (KT == true)
		{
			cout << a[i] << "   ";
		}
	}
}

int main()
{	
	int a[100];  
	int n; 
	cout << "\nNhap so luong phan tu mang: ";
	cin >> n;

	
	cout << "\n\n\t\t NHAP MANG\n";
	Nhap_Mang(a, n);
	
	cout << "\n\n\t\t XUAT MANG\n";
	Xuat_Mang(a, n);


	cout << "\n\n\t\t CAC SO SIEU NGUYEN TO: ";
	Xuat_Cac_So_Sieu_Nguyen_To(a, n);


	system("pause");
	return 0;
}
