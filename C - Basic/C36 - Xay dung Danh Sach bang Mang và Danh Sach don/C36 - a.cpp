#include <stdio.h>

struct canbo{
	long maso;
	char ten[8];
};

struct danhsach{
	canbo a[100];
	int ts;
};

void khoitao(danhsach &d) {
	d.ts = 0;
}

void doctep(danhsach &d) {
	FILE *fdoc = fopen("input_struct.txt", "r");
	fscanf(fdoc, "%d", &d.ts);
	for (int i = 0; i < d.ts; i++) {
		fscanf(fdoc, "%ld", &d.a[i].maso);
		fscanf(fdoc, "%s", &d.a[i].ten);
	}
	fclose(fdoc);
}

int ktrong(danhsach d) {
	if (d.ts == 0) {
		return 1;
	}
	return 0;
}

void themdau(danhsach &d, canbo x) {
	if (ktrong(d)) {
		d.a[0] = x;
	}
	else {
		for (int i = d.ts; i > 0; i--) {
			d.a[i] = d.a[i-1];
		}
		d.a[0] = x;
	}
	d.ts++;
}

void themcuoi(danhsach &d, canbo x) {
	if (ktrong(d)) {
		d.a[0] = x;
	}
	else {
		d.a[d.ts] = x;
	}
	d.ts++;
}

void themsauk(danhsach &d, canbo x, int k) {
	if (k == d.ts - 1) {
		themcuoi(d, x);
		return;
	}
	for (int i = d.ts; i > k + 1; i--) {
		d.a[i] = d.a[i-1];
	}
	d.a[k+1] = x;
	d.ts++;
}

void themtruock(danhsach &d, canbo x, int k) {
	if (k == 0) {
		themdau(d, x);
		return;
	}
	for (int i = d.ts; i > k; i--) {
		d.a[i] = d.a[i-1];
	}
	d.a[k] = x;
	d.ts++;
}

void xoadau(danhsach &d) {
	for (int i = 0; i < d.ts - 1; i++) {
		d.a[i] = d.a[i+1];
	}
	d.ts--;
}

void xoacuoi(danhsach &d) {
	d.ts--;
}

void xoak(danhsach &d, int k) {
	for (int i = k; i < d.ts - 1; i++) {
		d.a[i] = d.a[i+1];
	}
	d.ts--;
}

void xoa(danhsach &d) {
	d.ts = 0;
}

void xem(danhsach d) {
	if (d.ts == 0) {
		return;
	}
	for (int i = 0; i < d.ts; i++) {
		printf("%ld\t%s\n", d.a[i].maso, d.a[i].ten);
	}
}

void ghitep(danhsach d) {
	FILE *fghi = fopen("output_struct.txt", "w");
	for (int i = 0; i < d.ts; i++) {
		fprintf(fghi, "%ld\t%s\n", d.a[i].maso, d.a[i].ten);
	}
	fclose(fghi);
}

void nhapCB(canbo &x) {
	printf("Nhap ma so: ");
	scanf("%ld", &x.maso);
	printf("Nhap ten: ");
	scanf("%s", &x.ten);
}

int main() {
	danhsach d;
	canbo x;
	int k;
	int choice;
	while (1) {
		fflush(stdin);
		printf("0. Ket thuc\n");
		printf("1. Khoi tao danh sach\n");
		printf("2. Them dau\n");
		printf("3. Them cuoi\n");
		printf("4. Them sau vi tri k\n");
		printf("5. Them truoc vi tri k\n");
		printf("6. Xoa dau\n");
		printf("7. Xoa cuoi\n");
		printf("8. Xoa vi tri k\n");
		printf("9. Xoa danh sach\n");
		printf("10. Xem danh sach\n");
		printf("11. Doc danh sach tu tep\n");
		printf("12. Ghi danh sach vao tep\n\n");
		scanf("%d", &choice);
		if (choice == 0) {
			break;
		}
		if (choice == 1) {
			khoitao(d);
		}
		if (choice == 2) {
			nhapCB(x);
			themdau(d, x);
		}
		if (choice == 3) {
			nhapCB(x);
			themcuoi(d, x);
		}
		if (choice == 4) {
			printf("Nhap vi tri k: ");
			scanf("%d", &k);
			nhapCB(x);
			themsauk(d, x, k);
		}
		if (choice == 5) {
			printf("Nhap vi tri k: ");
			scanf("%d", &k);
			nhapCB(x);
			themtruock(d, x, k);
		}
		if (choice == 6) {
			xoadau(d);
		}
		if (choice == 7) {
			xoacuoi(d);
		}
		if (choice == 8) {
			printf("Nhap vi tri k: ");
			scanf("%d", &k);
			xoak(d, k);
		}
		if (choice == 9) {
			xoa(d);
		}
		if (choice == 10) {
			xem(d);
		}
		if (choice == 11) {
			doctep(d);
		}
		if (choice == 12) {
			ghitep(d);
		}
		printf("\n");
	}
	return 0;
}

