#include <iostream>
using namespace std;

int main()
{
	//Khai bao a,b,c
	int a, b, c;
	
	
	//Yeu cau nhap a:
	do
	{
		cout << "Nhap a: ";
		cin >> a;

	} while (a <= 0 );
	//Yeu cau nhap b:
	do
	{
		cout << "Nhap b: ";
		cin >> b;

	} while (b <= 0);
	//Yeu cau nhap c:
	do
	{
		cout << "Nhap c: ";
		cin >> c;

	} while (c <= 0);


	//Tinh giai thua cua a:
	int GTa = 1;
	for ( int i = 2; i <=a; i++)
	{
		GTa *= i;
	} 
	//Tinh giai thua cua b:
	int GTb = 1;
	for (int i = 2; i <= b; i++)
	{
		GTb *= i;
	} 
	//Tinh giai thua cua c:
	int GTc = 1;
	for (int i = 2; i <= c; i++)
	{
		GTc *= i;
	} 


	//in ra man hinh:
	cout << "Giai Thua a = " << GTa << endl;
	cout << "Giai Thua b = " << GTb << endl;
	cout << "Giai Thua c = " << GTc << endl;
	
	
	system("pause");
	return 0;

}
