#include<iostream>
using namespace std;
int main()
{
	int S = 1, n, i = 1;
	cout << "Nhap so nguyen n > 0:  "
	cin >> n;
	while (i <= n) 
	{
		S = S*i;
		i++;
	}
	cout << S << endl;
	system("pause");
	return 0;
}
