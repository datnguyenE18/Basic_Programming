#include<stdio.h>
#include<conio.h>
int dodai(char s[]){
	int m = 0;
	while (s[m] != '\0') m++;
	return m;
}
int ktxau(char s1[],char s2[]){
	for(int i = 0;i < dodai(s1) - dodai(s2) + 1;i++){
		int kt = 1;
		for(int j = 0;j < dodai(s2);j++){
			if (s1[i + j] != s2[j]) {
				kt = 0;
				break;
			}
		}
		if (kt) return 1;
	}
	return 0;
}
void doctep(char s1[],char s2[]){
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%s%s",s1,s2);
	fclose(f);
}
main(){
	char s1[100],s2[100];
	doctep(s1,s2);
	printf("%d",ktxau(s1,s2));
}
