#include<stdio.h>
#include<conio.h>

void doctep(char s[])
{
	FILE *f = fopen("input.txt","r");
	fgets(s,100000,f);
	fclose(f);
}

int tongchuso(char s[])
{
	int dem = 0;
	for ( int i = 0; s[i] != NULL ; i++)
		{
			if(s[i] >= '0' && s[i] <= '9')
					dem++;
		}
	return dem;
}

int main()
{
	char s[100000];
	doctep(s);
	printf("%d", tongchuso(s));
	return 0;
}
