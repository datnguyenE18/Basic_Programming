#include<stdio.h>
#include<conio.h>

void doctep(float a[], int &n)
{
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d", &n);
	for (int i = 0; i < n; i++)
		{
			fscanf(f,"%f", &a[i]);
		}
	fclose(f);
}

float nhonhat(float a[], int n)
{	
	float min = a[0];
	for (int i = 0; i < n; i++)
			if(min >= a[i])
				min = a[i];
	return min;
}

int main()
{
	int n;
	float a[1000];
	doctep(a,n);
	printf("Gia tri nho nhat: %f", nhonhat(a,n));
	return 0;
}
