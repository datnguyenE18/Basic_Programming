#include <stdio.h>

void doctep(char s1[], char s2[]) 
{
	FILE *fdoc = fopen("input.txt", "r");
	fgets(s1, 100000, fdoc);
	fgets(s2, 100000, fdoc);
	fclose(fdoc);
}

int ktxau(char s1[], char s2[]) 
{
	int dai1 = 0, dai2 = 0;
	while (s1[dai1] != NULL) 
	{
		dai1++;
	}
	
	//xoa dau ENTER phia truoc ki tu NULL ket thuc xau s1[]
	s1[dai1-1] = NULL;
	dai1--;
	
	while (s2[dai2] != NULL) 
	{
		dai2++;
	}
	if (dai1 < dai2) 
	{
		return 0;
	}
	for (int i = 0; i < dai1; i++) 
	{
		if (s1[i] == s2[0]) 
		{
			int j = 0;
			while (s1[i] == s2[j] && i < dai1 && j < dai2) 
			{
				i++;
				j++;
			}
			if (j == dai2) 
			{
				return 1;
			}
		}
	}
	return 0;
}

int main() 
{
	char s1[100000], s2[100000];
	doctep(s1, s2);
	if (ktxau(s1, s2)) 
	{
		printf("Xau s1 co chua xau s2");
	}
	else 
	{
		printf("Xau s1 khong chua xau s2");
	}
	return 0;
}

