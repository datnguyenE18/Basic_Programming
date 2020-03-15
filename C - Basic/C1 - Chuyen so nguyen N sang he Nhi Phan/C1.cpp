#include<stdio.h>
#include<conio.h>

void docfile(int &n)
{
	FILE*f = fopen("input.txt", "r");
	fscanf(f, "%d", &n);
	fclose(f);
}

void ghifile(int &n)
{
	int sum = 0, i = 1, du ;
	FILE*f=fopen("output.txt","w");
	while(n > 0)
	{
		du = n % 2;
		sum = sum + (i * du);
		n = n / 2;
		i = i * 10;
	}
	fprintf(f, "Doi sang nhi phan la: %d\t", sum);
	fclose(f);
}

int main()
{
		int n;
		docfile(n);
		ghifile(n);
		return 0;
}
