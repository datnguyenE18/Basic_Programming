#include<iostream>
using namespace std;
int main(int argc, char **argv)
{
	int x = 1;
	while (x <= 10 && x >= 1)
	{
		cout << x << " " ;
		x++;
	}
	cout << endl;
	system("pause");
	return 0;
}
