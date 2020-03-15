#include<stdio.h>
#include<conio.h>

void docfile(int &n, float a[])
{
	FILE *f = fopen ("input.txt", "r");
	fscanf(f,"%d", &n);
	for(int i = 0; i < n; i++)
			fscanf(f,"%f",&a[i]);	
	fclose(f);
}

int max(int &n, float a[])
{
	float max = a[0];
	for (int i = 0; i < n; i++)
		if (max < a[i]) 
			max = a[i];
	return max;
}

void ghifile (int &n, float a[])
{
	FILE *f = fopen("output.txt","w");
	for (int i = 0; i < n; i++)
		if ( a[i] == max(n,a) )
			fprintf(f,"Max %f co vi tri %d\n", a[i], i + 1);
	fclose(f);
}

int main()
{
	int n;
	float a[10];
	docfile(n,a);
	ghifile(n,a);
	return 0;
}
