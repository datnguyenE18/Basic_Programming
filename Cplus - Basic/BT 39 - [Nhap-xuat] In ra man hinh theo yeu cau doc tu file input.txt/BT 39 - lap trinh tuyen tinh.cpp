#include<iostream>
#include<fstream>
#include<math.h>

using namespace std;

int main()
{
	//MO VA DOC FILE:
	ifstream fin;
	fin.open("input.txt", ios_base::in);
	
	if (fin.fail()==true)
	{
		cout << "Co gi do khong dung?!";
		system("pause");
		return 0;
	}

	//IN THONG TIN FILE VUA DOC:
	cout << "Day vua doc la:" << endl;
	int a[1000];
	int n = 0;
	fin >> n;
	for (int i = 0; i < n; i++)
	{
		fin >> a[i];
		cout << a[i] << "	";
	}
	cout << endl;

	int MIN = a[0], MAX = a[0];

	//TIM SO LON NHAT:
	
	for (int i = 0; i < n; i++)
	{
		if (MAX <= a[i])
		{
			MAX = a[i];
		}
	} 

	//TIM SO NHO NHAT:
	for (int i = 0; i < n; i++)
	{
		if (MIN >= a[i] )
		{
			MIN = a[i];
		}
	}
	cout << "So lon nhat la: " << MAX << endl;
	cout << "So nho nhat la: " << MIN << endl;
	cout << "Cac so chan: " << " ";
	// TIM SO CHAN:
	for (int i = 0; i < n; i++)
	{
		if (a[i] % 2 ==0)
		{
			cout <<"	"<< a[i] ;
		}
	}

	cout << "\nCac so le: " << " ";
	//TIM SO LE:
	for (int i = 0; i < n; i++)
	{
		if (a[i] % 2 != 0)
		{
			cout << "	" << a[i];
		}
	}
	cout << endl;
	fin.close();
	system("pause");
	return 0;

}