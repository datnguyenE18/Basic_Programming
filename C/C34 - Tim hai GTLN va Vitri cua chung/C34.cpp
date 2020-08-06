#include <stdio.h>

void doctep(float a[], int &n) {
	FILE *fdoc = fopen("input.txt", "r");
	fscanf(fdoc, "%d", &n);
	for (int i = 0; i < n; i++) {
		fscanf(fdoc, "%f", &a[i]);
	}
	fclose(fdoc);
}

void timso(float a[], int n, float &max1, int &vt1, float &max2, int &vt2) {
	float min = a[0];
	int vtmin = 0;
	int i = 1;
	while (i < n) {
		while (a[i] < min) {
			min = a[i];
			vtmin = i;
			break;
		}
		i++;
	}
	max1 = min;
	i = 0;
	while (i < n) {
		while (a[i] > max1) {
			max1 = a[i];
			vt1 = i;
			break;
		}
		i++;
	}
	int flag = 0;
	max2 = min;
	i = 0;
	while (i < n) {
		while (a[i] > max2 && a[i] < max1) {
			max2 = a[i];
			vt2 = i;
			flag = 1;
			break;
		}
		i++;
	}
	while (flag == 0) {
		vt2 = vtmin;
		break;
	}
}

int main() {
	int n, vt1 = 0, vt2 = 0;
	float a[100000], max1 = 0, max2 = 0;
	doctep(a, n);
	timso(a, n, max1, vt1, max2, vt2);
	while (max1 == max2) {
		printf("Khong co so nao lon nhat va lon nhi");
		return 0;
	}
	printf("Max1 = %.2f  _  Vi tri %d \n", max1, vt1);
	printf("Max2 = %.2f  _  Vi tri %d", max2, vt2);
	return 0;
}

