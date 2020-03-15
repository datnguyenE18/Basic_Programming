#include <stdio.h>
#include <conio.h>

void docfile (int &n, float &x, float a[]) {
	FILE*f=fopen ("input.txt", "r");
	fscanf (f, "%d", &n);
	fscanf (f, "%f\n", &x);
	for (int i=0; i<n; i++) {
		fscanf (f, "%f", &a[i]);
	}
}
 
void chensox (int &n, float &x, float a[]) {
	for (int i=0; i<n; i++) {
		if ((x>a[i])&&(x<a[i+1])) {
			for (int j=n; j>i+1; j--){
				a[j]=a[j-1];
			}
			a[i+1]=x;
		}
	}
} 

void ghifile (int &n, float &x, float a[]) {
	FILE *f=fopen ("chenx.txt", "w");
	chensox (n,x,a);
	for (int i=0; i<n+1; i++) {
		fprintf (f, "%f ", a[i]);
	}
}

int main () {
	int n;
	float x, a[10];
	docfile (n,x,a);
	ghifile (n,x,a);
	return 0;
}
