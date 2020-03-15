#include<iostream>
#include<fstream>
#include<math.h>

using namespace std;

int GTLN(int a[], int n);
int GTNN(int a[], int n);
void Sochan(int a[], int n);
void Sole(int a[], int n);

// HAM CHINH (MAIN)

int main()
{
	//MO VA DOC FILE:
	ifstream fin;
	fin.open("input.txt", ios_base::in);

	if (fin.fail() == true)
	{
		cout << "Co gi do khong dung?!";
		system("pause");
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
	int MIN = a[0], MAX ;
	MAX = GTLN(a, n);
	MIN = GTNN(a, n);
	cout << "So lon nhat la: " << MAX << endl;
	cout << "So nho nhat la: " << MIN << endl;
	cout << "Cac so chan: " << " ";
	Sochan(a , n);
	cout << "\nCac so le: " << " ";
	Sole(a, n);
	cout << endl;
	fin.close();
	system("pause");
	return 0;
}


//TIM SO LON NHAT:

int GTLN(int a[], int n)
{
	int MAX = a[0];
	for (int i = 0; i < n; i++)
	{
		if (MAX <= a[i])
		{
			MAX = a[i];
		}
	}
	return MAX;
}

//TIM SO NHO NHAT:

int GTNN(int a[], int n)
{
	int MIN = a[0];
	for (int i = 0; i < n; i++)
	{
		if (MIN >= a[i])
		{
			MIN = a[i];
		}
	}
	return MIN;
}

//TIM SO CHAN:

void Sochan(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		if (a[i] % 2 == 0)
		{
			cout << "	" << a[i];
		}
	}
}

//TIM SO LE:

void Sole(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		if (a[i] % 2 != 0)
		{
			cout << "	" << a[i];
		}
	}
}