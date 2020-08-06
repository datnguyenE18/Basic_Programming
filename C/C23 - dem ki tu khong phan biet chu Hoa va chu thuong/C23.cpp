#include <stdio.h>

void doctep(char s[]) {
	FILE *f = fopen("input.txt", "r");
	fgets(s, 1000, f);
	fclose(f);
}

void ghitep(char kt[], int sl[], int tskt) {
	FILE *f = fopen("output.txt", "w");
	for (int i = 0; i < tskt; i++) {
		fprintf(f, "%c: %d\n", kt[i], sl[i]);
	}
	fclose(f);
}

void demkytu2(char s[], char kt[], int sl[], int &tskt) {
	for (int i = 0; s[i] != NULL; i++) {
		if (s[i] < 'A' || (s[i] > 'Z' && s[i] < 'a') || s[i] > 'z') {
			continue;
		}
		if (s[i] >= 'A' && s[i] <= 'Z') 
			s[i] = s[i] + 32;
		int j;
		for (j = 0; j < tskt; j++)
		{
			if (s[i] == kt[j] || s[i] + 32 == kt[j] || s[i] - 32 == kt[j]) 
			{
				sl[j]++;
				break;
			}
		}
		if (j == tskt) {
			tskt++;
			kt[tskt-1] = s[i];
			sl[tskt-1] = 1;
		}
	}
}

int main() {
	char s[1000] , kt[1000];
	int sl[1000] , tskt = 0;
	doctep(s);
	demkytu2(s, kt, sl, tskt);
	ghitep(kt, sl, tskt);
	return 0;
}

