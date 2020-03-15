#include <stdio.h>

void doctep(float a[], int &n) {
	FILE *fdoc = fopen("input1.txt", "r");
	fscanf(fdoc, "%d", &n);
	for (int i = 0; i < n; i++) {
		fscanf(fdoc, "%f", &a[i]);
	}
	fclose(fdoc);
}

int kiemtrasapxep(float a[], int n) 
{
	for (int i = 0; i < n - 1; i++) 
	{
		if (a[i] > a[i+1]) 
		{
			return 0;
		}
	}
	return 1;
}

int main() {
	int n;
	float a[100000];
	doctep(a, n);
	if (kiemtrasapxep(a, n)) {
		printf("Da duoc sap xep tang dan");
	}
	else {
		printf("Chua duoc sap xep tang dan");
	}
	return 0;
}

