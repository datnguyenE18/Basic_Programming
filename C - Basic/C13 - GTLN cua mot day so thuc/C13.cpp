#include<stdio.h>
#include<conio.h>

void doctep(float a[], int &n)
{
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d", &n);
	for (int i = 1; i < n; i++)
		{
			fscanf(f,"%f", &a[i]);
		}
	fclose(f);
}

float lonnhat(float a[], int n)
{	
	float max = a[0];
	for (int i = 0; i < n; i++)
			if(max <= a[i])
				max = a[i];
	return max;
}

int main()
{
	int n;
	float a[1000];
	doctep(a,n);
	printf("Gia tri lon nhat: %f", lonnhat(a,n));
	return 0;
}
