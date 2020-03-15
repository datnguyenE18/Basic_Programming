#include<stdio.h>
#include<conio.h>

void docfile(int &n, float a[])
{
	FILE *f = fopen ("input.txt","r");
	fscanf(f,"%d",&n);
	for (int i = 0; i < n; i++)
		fscanf(f,"%f",&a[i]);
	fclose(f);
}

void ghisolap(int &n, float a[], int dem[])
{
	FILE *f = fopen("output.txt","w");
	for (int i = 0; i < n; i++)
		{
			dem[i] = 0;
			for (int j = 0; j < n; j++)
				{
					if(a[i] == a[j])
					dem[i]++;
				}
		}
	for (int i = 0; i < n; i++)
		{
			if(dem[i] >= 2)
				fprintf(f,"%f\t",a[i]);
		}
	fclose(f);
}

int main ()
{
	int n;
	float a[100];
	int dem[100];
	docfile(n , a);
	ghisolap(n , a , dem);
	return 0;
}

