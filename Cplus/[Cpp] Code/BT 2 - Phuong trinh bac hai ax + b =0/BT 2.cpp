// giai phuong trình ax+b=c
#include <iostream>
using namespace std;

int main()
{
	float a, b, c, KQ;
	cout << "Nhap a,b,c: ";
	cin >>  a;
	cin >> b;
	cin >> c;
	if (a==0)
	{
		if (b==0)
		{
			if (c==0)
			{
				cout << "\nPhuong trinh vo so nghiem"<<endl;
			}
			else
			{
				cout << "\nPhuong trinh vo nghiem"<<endl;
			}

		}
		else
		{
			cout << "Phuong trinh vo nghiem"<<endl;
		}
		
	}
	else
	{
		cout << "\nx= " << (c - b) / a <<endl;
	}
	system("pause");
	return 0;
}


