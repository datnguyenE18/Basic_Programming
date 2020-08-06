include <iostream>
#include<math.h>
using namespace std;

// Ham tim Uoc Chung Lon Nhat:
int UCLN(int a, int b)
{
	if (a < b)
	{
		for ( int i = a; i >= 1 ; i-- )
		{
			if (a % i == 0 && b % i == 0)
			{
				return i;
			}

		}
	}

	else
	{
		for (int i = b; i >= 1; i--)
		{
			if (a % i == 0 && b % i == 0)
			{
				return i;
			}

		}
	}
}

//Ham tim Boi Chung Nho Nhat:
int BCNN(int a, int b)
{
	return (a*b) / UCLN(a, b);
}

int main()
{
	int a;
	int b;
	cout << "Nhap a: "; cin >> a;
	cout << "Nhap b: "; cin >> b;
	cout << "\nUCLN la: " << UCLN(a, b);
	cout << "\nBCNN la: " << BCNN(a, b) << endl;
 	system("pause");
	return 0;
}

