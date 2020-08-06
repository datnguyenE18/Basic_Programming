#include <iostream>
using namespace std;

//Ham nhap:
int Nhap()
{
	int n;
	do 
	{
		cin >> n;
	} while (n <= 0);
	return n;
}

//Ham tinh giai thua:
int Tinh_giai_thua(int n)
{
	//Tinh giai thua so nguyen duong n:
	int GT = 1;
	for (int i = 2; i <= n; i++)
	{
		GT *= i;
	}
	return GT;
}


//Ham chinh:
int main()
{
	//Khai bao a,b,c
	int a, b, c;


	//Yeu cau nhap a:
	cout << "Nhap a: ";
	a = Nhap();
	
	//Yeu cau nhap b:
	cout << "Nhap b: ";
	b = Nhap();
	
	//Yeu cau nhap c:
	cout << "Nhap c: ";
	c = Nhap();

	
	//Tinh giai thua cua a:
	int GTa = Tinh_giai_thua(a);
	//Tinh giai thua cua b:
	int GTb = Tinh_giai_thua(b);
	//Tinh giai thua cua c:
	int GTc = Tinh_giai_thua(c);


	//in ra man hinh:
	cout << "Giai Thua a = " << GTa << endl;
	cout << "Giai Thua b = " << GTb << endl;
	cout << "Giai Thua c = " << GTc << endl;


	system("pause");
	return 0;

}
