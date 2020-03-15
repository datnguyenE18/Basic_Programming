#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	ifstream fin;
	fin.open("input.txt", ios_base::in);
	
	if (fin.fail()==true)
	{
		cout << "Co gi do khong dung?!";
		system("pause");
		return 0;
	}

	int a[1000];
	int n = 0;
	fin >> n;
	for (int i = 0; i < n; i++)
	{
		fin >> a[i];
		cout << a[i] << " ";
	}
	cout << endl;
	fin.close();
	system("pause");
	return 0;

}
