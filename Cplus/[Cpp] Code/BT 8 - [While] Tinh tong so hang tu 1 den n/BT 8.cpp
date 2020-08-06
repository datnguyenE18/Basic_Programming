#include<iostream>
using namespace std;
int main(int argc, char **argv)
{
	int S = 0, n, i = 0;
	cout << "Nhap so nguyen n>0 :";
	cin >>n;
	while (i < n) 
	{
		i++;
		S = S + i;
		
	}
	cout << S << endl;
	system("pause");
	return 0;
}
