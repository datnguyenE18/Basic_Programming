#include<iostream>
using namespace std;


int main()
{
	int a[100];  // chua toi da 100 phan tu so nguyen
	int n; // so luong phan tu hien co trong mang
	cout << "Nhap so luong phan tu mang: ";
	cin >> n;

	// NHAP MANG:
	cout << "\n\n\t\t NHAP MANG\n";
	for (int i = 0; i < n; i++)
	{
		cout << "\nNhap phan tu a[" << i << "] = ";
		cin >> a[i];
	}

	// XUAT MANG:
	cout << "\n\n\t\t XUAT MANG\n";
	for (int i = 0; i < n; i++)
	{
		cout << a[i] << " ";
	}

	//// SNT:
	cout << "\n\n\t\t CAC SO NGUYEN TO: ";
	for (int i = 0; i < n; i++)
	{
		// Dung bien KT la Co Hieu
		bool KT = true; // Gia Su a[i] la SNT
		//Kiem tra Gia Su
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
					KT = false; // Cap nhat lai Gia Su ban dau la False
					break; // dung viec kiem tra vi da phat hien a[i] khong phai SNT
				}
			}
		}

		// Kiem tra lai Gia Su ban dau và Ket luan:
		if (KT == true)
		{
			cout << a[i] << "  ";
		}
	}

	//// so Sieu Nguyen To:
	cout << "\n\n\t\t CAC SO SIEU NGUYEN TO: ";
	for (int i = 0; i < n; i++)
	{
		int tam = a[i]; // cho bien "tam" giu gia tri cua a[i]
		bool KT = true; // Gia Su a[i] la so Sieu Nguyen To
		// Kiem tra so Sieu Nguyen To
		while (tam != 0)
		{
			// Dung bien KT la Co Hieu
			KT = true; // ...Gia Su "tam" <=> a[i] là so Sieu Nguyên To
			//Kiem tra Gia Su
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
						KT = false; // Cap nhat lai Gia Su ban dau la False
						break; // dung viec kiem tra vi da phat hien a[i] khong phai so Sieu Nguyen To
					}
				}
			}

			// Kiem tra lai Gia Su ban dau và Ket luan:
			if (KT == true)
			{
				tam = tam / 10; // loai bo chu so ben Phai(right) de tiep tuc Kiem tra
			}
			else
			{
				break; // dung viec Kiem tra và Ket luan
			}
		}

		// sau khi thoat khoi vong lap while ==> Kiem tra lai bien KT 
		if (KT == true)
		{
			cout << a[i] << "   ";
		}
	}


	system("pause");
	return 0;
}
