#include<iostream>
using namespace std;
int main()
{
	int n, s = 0; 
	cin >> n;
	for ( int i = 0; i <= n; i++) // i bi gioi han trong vong lap For roi. Khong dung ngoai vong lap For duoc!
	{
		s = s + i;
	}
	cout << s << endl;
	system("pause");
	return 0;
}

