#include<stdio.h>
#include<conio.h>

void doctep(float a[], int &n, float &x)
{
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d", &n);
	for(int i = 1; i <= n; i++)
		{
			fscanf(f,"%f", &a[i]);
		}
	fscanf(f,"%f", &x);
	fclose(f);
}

int demso(float a[], int n, float x)
{
	int dem = 0;
	for (int i = 1; i <= n; i++)
		{
			if(a[i] == x)
				dem++;
		}
	return dem;
}

int main()
{
	float a[1000];
	int n;
	float x;
	doctep(a,n,x);
	printf("So x duoc lap lai: %d", demso(a,n,x));
	return 0;
}
