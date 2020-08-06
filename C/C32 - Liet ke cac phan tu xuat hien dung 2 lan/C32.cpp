#include <stdio.h>

void doctep(float a[], int &n) {
	FILE *fdoc = fopen("input.txt", "r");
	fscanf(fdoc, "%d", &n);
	for (int i = 0; i < n; i++) {
		fscanf(fdoc, "%f", &a[i]);
	}
	fclose(fdoc);
}

void ghitep(float a2[], int m) {
	FILE *fghi = fopen("output.txt", "w");
	for (int i = 0; i < m; i++) {
		fprintf(fghi, "%.2f ", a2[i]);
	}
	fclose(fghi);
}

void solan2(float a[], int n, float a2[], int &m) {
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (a[i] > a[j]) {
				float temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
	}
	if (a[0] == a[n-1]) {
		return;
	}
	for (int i = 0; i < n; i++) {
		int dem = 1;
		while (a[i] == a[i+1]) {
			dem++;
			i++;
		}
		if (dem == 2) {
			a2[m++] = a[i];
		}
	}
}

int main() {
	int n, m = 0;
	float a[100000], a2[100000];
	doctep(a, n);
	solan2(a, n, a2, m);
	ghitep(a2, m);
	return 0;
}

