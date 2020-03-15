#include<iostream>
using namespace std;

/*
Khuon mau ham (FUNCTION TEMPLATE)
*/


template <class p1, class p2>
p1 Tim_Max(p1 x, p2 y)
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
int main()
{
	int a = 5;
	int b = 10;
	cout << "Max so nguyen: " << Tim_Max(a, b);

	float c = 8.9;
	float d = 4.5;
	cout << "\nMax so thuc: " << Tim_Max(c, d) <<endl;


	system("pause");
	return 0;
}
