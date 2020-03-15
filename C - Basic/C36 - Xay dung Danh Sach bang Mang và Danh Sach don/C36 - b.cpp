#include <stdio.h>
#include <stdlib.h>

struct canbo{
	long maso;
	char ten[8];
};

struct node{
	canbo info;
	struct node *next;
};
typedef struct node NODE;

struct danhsach{
	NODE *pfirst, *plast;
};

void khoitao(danhsach &d) {
	d.pfirst = d.plast = NULL;
}

int ktrong(danhsach d) {
	if (d.pfirst == NULL) {
		return 1;
	}
	return 0;
}

void themdau(danhsach &d, canbo x) {
	NODE *p = (NODE*) malloc(sizeof(NODE));
	p->info = x;
	if (ktrong(d)) {
		d.pfirst = d.plast = p;
		p->next = NULL;
		return;
	}
	p->next = d.pfirst;
	d.pfirst = p;
}

void themcuoi(danhsach &d, canbo x) {
	NODE *p = (NODE*) malloc(sizeof(NODE));
	p->info = x;
	if (ktrong(d)) {
		d.pfirst = d.plast = p;
		p->next = NULL;
		return;
	}
	d.plast->next = p;
	p->next = NULL;
	d.plast = p;
}

void doctep(danhsach &d) {
	FILE *fdoc = fopen("input_struct.txt", "r");
	int n;
	fscanf(fdoc, "%d", &n);
	for (int i = 0; i < n; i++) {
		canbo x;
		fscanf(fdoc, "%ld", &x.maso);
		fscanf(fdoc, "%s", &x.ten);
		themcuoi(d, x);
	}
	fclose(fdoc);
}

void themsauk(danhsach &d, canbo x, int k) {
	NODE *q = d.pfirst;
	for (int i = 1; i <= k; i++) {
		q = q->next;
	}
	NODE *p = (NODE*) malloc(sizeof(NODE));
	p->info = x;
	p->next = q->next;
	q->next = p;
}

void themtruock(danhsach &d, canbo x, int k) {
	NODE *q = d.pfirst;
	for (int i = 1; i < k; i++) {
		q = q->next;
	}
	NODE *p = (NODE*) malloc(sizeof(NODE));
	p->info = x;
	p->next = q->next;
	q->next = p;
}

void xoadau(danhsach &d) {
	NODE *p = d.pfirst;
	d.pfirst = d.pfirst->next;
	free(p);
}

void xoacuoi(danhsach &d) {
	NODE *p = d.plast;
	for (NODE *q = d.pfirst; q != d.plast; q = q->next) {
		if (q->next == d.plast) {
			d.plast = q;
			q->next = NULL;
			free(p);
			return;
		}
	}
}

void xoak(danhsach &d, int k) {
	NODE *q = d.pfirst;
	for (int i = 1; i < k; i++) {
		q = q->next;
	}
	NODE *h = d.pfirst;
	for (int i = 1; i <= k; i++) {
		h = h->next;
	}
	NODE *p = q->next;
	q->next = h->next;
	free(p);
}

void xoa(danhsach &d) {
	NODE *p;
	while (d.pfirst != NULL) {
		p = d.pfirst;
		d.pfirst = d.pfirst->next;
		free(p);
	}
}

void xem(danhsach d) {
	if (ktrong(d)) {
		return;
	}
	for (NODE *p = d.pfirst; p != NULL; p = p->next) {
		printf("%ld\t%s\n", p->info.maso, p->info.ten);
	}
}

void ghitep(danhsach d) {
	FILE *fghi = fopen("output_struct.txt", "w");
	for (NODE *p = d.pfirst; p != NULL; p = p->next) {
		fprintf(fghi, "%ld\t%s\n", p->info.maso, p->info.ten);
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

