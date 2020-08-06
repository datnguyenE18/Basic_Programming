#include <iostream>
#include<math.h>
using namespace std;

bool Kiem_Tra_So_Nguyen_To(int n) //Neu n la  SNT thi tra ve True, nguoc lai tra ve failse
{
	int i;
	if (n <2 )
	{
		return false;
	}
	else if (n == 2)
	{
		return true;
	}
	else // Neu n > 2
	{
		if (n % 2 ==0 ) // Neu n chia het cho 2
		{
			return false;
		}
		else // Neu n khong chia het cho 2
		{
			for ( i = 2 ; i < n; i++ )
			{
				if (n % i == 0)
				{
					return false; // neu o day dung thi se dung o day, ben duoi khong chay nua
				}
			}
		}
	}
	return true; // Neu sau qua trinh kiem tra khong co Ket Qua phu hop thi tra ve True
}

int main()
{
	int a;
	cout << "Nhap a: ";
	cin >> a;
	bool KT = Kiem_Tra_So_Nguyen_To(a);
	if (KT == true)
	{
		cout << "SNT" << endl;
	}
	else
	{
		cout << "Khong phai SNT" << endl;
	}
	system("pause");
	return 0;


}

