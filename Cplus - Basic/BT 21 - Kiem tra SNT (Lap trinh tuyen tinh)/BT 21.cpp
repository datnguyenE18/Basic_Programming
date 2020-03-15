#include <iostream>
#include<math.h>
using namespace std;

int  main()
{
	int i, n;
	cout << "Nhap n: ";
	cin >> n;
	if (n <2)
	{
		cout << "Khong phai SNT" << endl;
	}
	else if (n == 2)
	{
		cout << "SNT" << endl;
	}
	else
	{
		for ( i = 2; i < n; ++i)
		{
			if (n % i == 0)
			{
				cout << "Khong phai SNT" << endl;
				system("pause");
				return 0;
			}

		}
		cout << "SNT" << endl;
	}
	system("pause");
	return 0;
}

