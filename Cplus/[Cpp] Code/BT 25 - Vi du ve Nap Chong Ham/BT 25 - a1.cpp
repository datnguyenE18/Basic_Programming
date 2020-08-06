#include <iostream>
using namespace std;

//Ham tim GTLN giua hai so nguyen:
int Max(int a, int b)
{
	if (a > b)
	{
		return a;
	}
	else if (b > a)
	{
		return b;
	}
	return a;
}

//Ham tim GTLN giua hai so thuc:
float Max(float a, float b)
{
	if (a > b)
	{
		return a;
	}
	else if (b > a)
	{
		return b;
	}
	return a;
}

//Ham main:
int main()
{
	/*int a, b;*/
	float a, b;
	cin >> a;
	cin >> b;
	cout << "GTLN la: " << Max(a, b) <<endl;
	system("pause");
	return 0;
}
