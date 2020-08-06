#include<stdio.h>
#include<conio.h>
void demso(float a[],int n,float so[],int sl[],int &tongso){
	for(int i = 0;i < n;i++){
		int so1 = 1;
		for(int j = 1;j <= tongso;j++)
			if (so[j] == a[i]) {
				so1 = 0;
				sl[j]++;
				break;
			}
		if (so1) {
			tongso++;
			so[tongso] = a[i];
			sl[tongso] = 1;
		}
	}
}
void doctep(float a[],int &n){
	FILE *f = fopen("input.txt","r");
	fscanf(f,"%d",&n);
	for(int i = 0;i < n;i++)
		fscanf(f,"%f",&a[i]);
	fclose(f);
}
void ghitep(float so[],int sl[],int tongso){
	FILE *f = fopen("output.txt","w");
	for(int i = 1;i <= tongso;i++){
		fprintf(f,"%f:  %d\n",so[i],sl[i]);
	}
	fclose(f);
}
main(){
	float a[100],so[100];
	int sl[100],tongso = 0,n;
	doctep(a,n);
	demso(a,n,so,sl,tongso);
	ghitep(so,sl,tongso);
}
