#include<stdio.h>
#include<conio.h>

void doctep(char s[])
{
	FILE *f = fopen("input.txt","r");
	fgets(s,100000,f);
	fclose(f);	
}

int demtu(char s[])
{
	int dem =0;
	if(s[0] != ' ' && s[0] != NULL)
		dem = 1;
	for (int i = 1; s[i] != NULL ; i++)
	{
		if(s[i - 1] == ' ' && s[i] != ' ')
			dem ++;
	}
	return dem;
}

int main()
{
	char s[100000];
	doctep(s);
	printf("%d", demtu(s));
	return 0;
}

