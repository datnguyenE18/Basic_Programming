#include<stdio.h>
#include<conio.h>

void doctep(char s[],int &n, int &m)
{
	FILE *f = fopen("input.txt","r");
	fgets(s,100000,f);
	fscanf(f,"%d %d",&n,&m);
	fclose(f);
}

char *trichtrai(char s[],int n, int m)
{
	char t[100000];
	int i = 0;
	while(i < n)
		t[i++] = s[m++];
	return t;
}

int main ()
{
	char s[100000];
	int n, m;
	doctep(s,n,m);
	printf("%s", trichtrai(s,n,m));
	return 0;
}
