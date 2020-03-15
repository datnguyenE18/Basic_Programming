#include <stdio.h>
#include <conio.h>
#include <string.h>

int main()
{
    int i, test=1;
    char s[1000];
    printf("Nhap chuoi : ");
    gets(s);
    for(i=0;i<=strlen(s)/2;i++)
        if (s[i]!=s[strlen(s)-i-1]) 
			{
				test=0;
				break;
			}
    if (test) 
		printf("True");
    else 
		printf("False");
    getch();
}
