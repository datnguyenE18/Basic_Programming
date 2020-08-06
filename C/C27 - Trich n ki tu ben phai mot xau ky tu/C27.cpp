#include <stdio.h>

void doctep(char s[], int &n) {
	FILE *fdoc = fopen("input.txt", "r");
	fgets(s, 100000, fdoc);
	fscanf(fdoc, "%d", &n);
	fclose(fdoc);
}

char *trichphai(char s[], int n) {
	char t[100000];
	int i = 0;
	while (s[i] != NULL) {
		i++;
	}
	s[i-1] = NULL;
	i--;
	
	while (n > 0) {
		t[--n] = s[--i];
	}
	return t;
}

int main() {
	int n;
	char s[100000];
	doctep(s, n);
	printf("%s", trichphai(s, n));
	return 0;
}

