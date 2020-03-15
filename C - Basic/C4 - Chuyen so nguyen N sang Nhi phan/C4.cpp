#include <stdio.h>

void doctep(long &n) {
	FILE *fdoc = fopen("input.txt", "r");
	fscanf(fdoc, "%d", &n);
	fclose(fdoc);
}

char *doinhiphan(long n) {
	char s[100000];
	int k = 0;
	while (n > 0) {
		s[k++] = n % 2 + '0';
		n /= 2;
	}
	for (int i = 0; i < k/2; i++) {
		char temp = s[i];
		s[i] = s[k-1-i];
		s[k-1-i] = temp;
	}
	s[k] = NULL;
	return s;
}

int main() {
	long n;
	doctep(n);
	printf("%s", doinhiphan(n));
	return 0;
}

