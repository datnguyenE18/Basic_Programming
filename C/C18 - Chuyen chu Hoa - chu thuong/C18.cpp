#include<stdio.h>
#include<conio.h>

void doctep(char s[])
{
	FILE *f = fopen("input.txt","r");
	fgets(s,100000,f);
	fclose(f);
}

char *doichuthuong(char s[])
{
	for (int i = 0; s[i] != NULL; i++)
		{
			if(s[i] >= 'A' && s[i] <= 'Z')
				s[i] += 32;
		}
	return s;
}

int main ()
{
	char s[100000];
	doctep(s);
	printf("%s", doichuthuong(s));
	return 0;
}
