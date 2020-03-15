#include<iostream>
using namespace std;

/*
Nap Chong Ham (FUNCTION OVERLOAING)

*/

// GTLN hai so nguyen:
int Tim_Max(int x, int y)
{
	if (x > y)
	{
		return x;
	}
	else if (x < y)
	{
		return y;
	}
	return y;
}

// GTLN hai so thuc:
float Tim_Max(float x, float y)
{
	if (x > y)
	{
		return x;
	}
	else if (x < y)
	{
		return y;
	}
	return y;
}

//Ham tinh tong:
int Tinh_Tong(int a, int b)
{
	return a + b;
}

int Tinh_Tong(int a, int b, int c, int d)
{
	return a + b + d + c;
}

int main()
{
	int a = 5;
	int b = 10;
	cout << "\nMax so nguyen: " << Tim_Max(a, b);

	float x = 8.9;
	float y = 4.5;
	cout << "\nMax so thuc: " << Tim_Max(a, b);

	/*int a = 10;
	int b = 9;
	int c = 5;
	int d = 4;
	cout << "\nTong la: " << Tinh_Tong(a, b, c, d) << endl; */
	system("pause");
	return 0;
}
