#include<stdio.h>
#include<conio.h>

void chenx(float a[],int n,float x)
{
	int vt = 0;
	a[n] = x + 1;
	for(int i = 0;i <= n;i++)
		{
			if (a[i] > x)
			{
				vt = i;
				break;
			}
		}
	for(int i = vt;i <= n;i++)
		{
			float tmp;
			tmp = x;
			x = a[i];
			a[i] = tmp;
		}
}

void doctep(float a[],int &n,float &x)
{
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d",&n);
	for(int i = 0;i < n;i++)
		fscanf(f,"%f",&a[i]);
	fscanf(f,"%f",&x);
	fclose(f);
}

void ghitep(float a[],int n)
{
	FILE *f = fopen("output.txt","w");
	for(int i = 0;i <= n;i++)
		fprintf(f,"%f ",a[i]);
	fclose(f);
}

main()
{
	float a[100],x;
	int n;
	doctep(a,n,x);
	chenx(a,n,x);
	ghitep(a,n);
}
