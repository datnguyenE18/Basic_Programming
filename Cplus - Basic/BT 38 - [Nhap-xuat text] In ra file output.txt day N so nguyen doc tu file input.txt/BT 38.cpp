#include<iostream>
#include<fstream>

using namespace std;

int main()
{
	ifstream fin;
	fin.open("input.txt", ios_base::in);

	if (fin.fail() == true)
	{
		cout << "\n File cua ban khong ton tai";
		system("pause");
		return 0;
	}

	int a[1000];
	int n = 0;
	fin >> n;
	for (int  i = 0; i < n; i++)
	{
		fin >> a[i];
	}


	ofstream fout;
	fout.open("output.txt", ios_base::out);
	for (int i = 0; i < n; i++)
	{
		fout << a[i] << " ";
	}

	fout.close();
	fin.close();
	system("pause");
	return 0;
}
