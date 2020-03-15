#include<stdio.h>
#include<conio.h>

void doctep(int &n)
{
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d",&n);
	fclose(f);
}

long giaithua(int n)
{
	long dem = 1;
	
	if(n == 0)
		return 1;
		
	for (int i = 1; i <=n ; i++)
		{
			dem *= i;
		}
	return dem;
}

int main ()
{
	int n;
	doctep(n);
	printf("%ld", giaithua(n));
	return 0;
}
