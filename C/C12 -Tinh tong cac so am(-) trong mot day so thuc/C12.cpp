#include<stdio.h>
#include<conio.h>

void doctep(float a[], int &n)
{
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d",&n);
	for (int i = 1; i <= n; i++)
		{
			fscanf(f,"%f",&a[i]);
		}
	fclose(f);
}

float tongam(float a[], int n)
{
	float sum = 0 ;
	for(int i = 1; i <= n; i++)
		{
			if(a[i] < 0)
				{
					sum += a[i];
				}
		}		
	return sum;			
}

int main()
{
	int n;
	float a[1000];
	doctep(a,n);
	printf("Tong cac so duong(+) la: %f", tongam(a,n));
	return 0;
}
