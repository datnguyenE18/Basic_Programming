#include<stdio.h>

void docfile(int &n, float a[]){
	FILE*f=fopen("input.txt","r");
	fscanf(f,"%d\n",&n);
	for(int i=0; i<n; i++){
		fscanf(f,"%f",&a[i]);
	}
	fclose(f);
}
void doicho(float &x, float &y){

	float tg=x; x=y; y=tg;
}

void nbot(int &n, float a[]){
	for(int i=0; i<n-1; i++)
		for(int j=n-1; j>i; j--)
			if(a[j] < a[j-1])
				doicho(a[j],a[j-1]);
}

void chon(int &n, float a[]){
	for(int i=0; i<n-1; i++){
		int max = i;
		for(int j=i+1; j<n; j++)
			if(a[j > a[max]])
				max = j;
		doicho(a[max],a[i]);
	}
}

void chen(int &n, float a[]){
	for(int i=0; i<n; i++){
		float x=a[i]; int pos = i-1;
		while((pos >= 0) && (a[pos] > x)){
			a[pos+1] = a[pos];
			pos--;
		}
		a[pos+1] = x;
	}
}

int main(){
	int n,k = 1;
	float a[10];
	char c;
	while(k){
		printf("0. Thoat\n");
		printf("1. Doc du lieu\n");
		printf("2. Noi bot\n");
		printf("3. Chon\n");
		printf("4. Chen\n");
		fflush(stdin);
		scanf("%c", &c);
		switch(c){
			case '0':{
				k = 0;
				break;
			}
			case '1':{
				docfile(n,a);
				printf("\n");
				break;
			}
			case '2':{
				FILE*f=fopen("nbot.txt","w");
				fprintf(f,"sap xep noi bot:\n");
				nbot(n,a);
				for(int i=0; i<n; i++)
					fprintf(f,"%.2f\t",a[i]);
				fclose(f);
				printf("\n");
				break;
			}
			case '3':{
				FILE*f=fopen("chon.txt","w");
				fprintf(f,"sap xep chon:\n");
				chon(n,a);
				for(int i=0; i<n; i++)
					fprintf(f,"%.2f\t",a[i]);
				fclose(f);
				printf("\n");
				break;
			}
			case '4':{
				FILE*f=fopen("chen.txt","w");
				fprintf(f,"sap xep chen:\n");
				chen(n,a);
				for(int i=0; i<n; i++)
					fprintf(f,"%.2f\t",a[i]);
				fclose(f);
				printf("\n");
				break;
			}
		}
	}
	return 0;
}

