#include<stdio.h>
#include<conio.h>

void doctep(char s[])
{
	FILE *f = fopen("input.txt","r");
	fgets(s, 100000, f);
	fclose(f);
}

int tongchuhoa(char s[])
{
	int sum = 0;
	for (int i = 0; s[i] != NULL; i++)
		if(s[i] >= 'A' && s[i] <= 'Z')
			sum++;
	return sum;
}

int main ()
{
	char s[100000];
	doctep(s);
	printf("Do dai: %d", tongchuhoa(s) );
	return 0;
}
