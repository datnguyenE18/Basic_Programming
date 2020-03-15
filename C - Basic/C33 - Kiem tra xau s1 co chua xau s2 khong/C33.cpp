#include <stdio.h>

void doctep(char s1[], char s2[]) {
	FILE *fdoc = fopen("input.txt", "r");
	fgets(s1, 100000, fdoc);
	fgets(s2, 100000, fdoc);
	fclose(fdoc);
}

int timxau(char s1[], char s2[], int &vtdau, int &vtcuoi) {
	int dai1 = 0, dai2 = 0;
	while (s1[dai1] != NULL) {
		dai1++;
	}
	
	s1[dai1-1] = NULL;
	dai1--;
	
	while (s2[dai2] != NULL) {
		dai2++;
	}
	while (dai1 < dai2) {
		return 0;
	}
	int i = 0;
	while (i < dai1) {
		while (s1[i] == s2[0]) {
			int j = 0;
			while (s1[i] == s2[j] && i < dai1 && j < dai2) {
				i++;
				j++;
			}
			while (j == dai2) {
				vtdau = i - j;
				vtcuoi = vtdau + dai2 - 1;
				return 1;
			}
			while (j < dai2) {
				i--;
				break;
			}
			break;
		}
		i++;
	}
	return 0;
}

int main() {
	char s1[100000], s2[100000];
	int vtdau = 0, vtcuoi = 0;
	doctep(s1, s2);
	while (timxau(s1, s2, vtdau, vtcuoi)) {
		printf("Xau s1 co chua xau s2 \n");
		printf("Vi tri bat dau: %d \n", vtdau);
		printf("Vi tri ket thuc: %d", vtcuoi);
		return 0;
	}
	printf("Xau s1 khong chua xau s2");
	return 0;
}

