#include <stdio.h>
#include <conio.h>

void docfile(char s[]){
	FILE*f = fopen("input.txt", "r");
	fgets(s, 20, f);
	fclose(f);
}
int dodai(char s[]){
	int x = 0;
	while(s[x]!='\0'){
		x++;
	}
	return x;
}
char *right(char s[], int n){
	if(n >= dodai(s)){
		return s;
	}
	else{
		int i;
		char *s1;
		s1 = new char[n+1];
		for(i = 0; i < n; i++){
			s1[i] = s[dodai(s)-n +i];
		}
		s1[n] = '\0';
		return s1;
	}
}
void ghifile(char s[], int n){
	int m, dem[256] = {0};
	FILE*f = fopen("output.txt", "w");
	int t = dodai(s);
	for(int i = 0; i < t; i++){
		dem[s[i]]++;
	}
	for(int i = 0; i < 256; i++){
		if(dem[i])
		fprintf(f, "Chu '%c' xuat hien %d lan\n", i, dem[i]);
	}
	fprintf(f, "\nCat %d ky tu cuoi la: %s", n, right(s, n));
	fclose(f);
}
int main(){
	int n = 3;
	char s[100];
	docfile(s);
	ghifile(s, n);
}

