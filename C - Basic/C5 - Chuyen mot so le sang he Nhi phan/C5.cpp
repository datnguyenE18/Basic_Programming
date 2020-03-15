#include<stdio.h>
#include<conio.h>
char *doinhiphan(float x,int n){
	char *p = new char[40];
	int i = 2;
	p[0] = '0';
	p[1] = '.';
	while (i < n + 2){
		x = x * 2.0;
		if (x >= 1.0){
			p[i] = '1';
			x = x - 1.0;
		} else p[i] = '0';
		i++;
	}
	p[i] = '\0';
	return p;
}
void doctep(float &x,int & n){
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%f",&x);
	fscanf(f,"%d",&n);
	fclose(f);
}
main(){
	float x;
	int n;
	doctep(x,n);
	printf(doinhiphan(x,n));
}
