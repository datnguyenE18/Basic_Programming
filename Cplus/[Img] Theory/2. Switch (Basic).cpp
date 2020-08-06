#include<stdio.h>
int main ()
{
	int a;
	printf (" 1 rau, 2 nuoc, 3 hoa qua "); // in ra thuc don
	printf (" Ban chon mon gi="); // hoi ban lua chon cua ban
	scanf("%d",&a); //yeu cau ban nhap lua chon
	
	printf("\n"); //xuong dong
	
	switch(a) //xet cac bien "a"
	{
		case 1: // Neu a=1 thi...
			printf("ban da chon rau"); // in ra man hinh dong
			break; //roi dung
		
		case 2:
			printf("ban da chon nuoc");
			break;
		
		case 3:
			printf("ban da chon hoa qua");
			break;
		default: //neu nhap "a" khac voi cac truong hop tren thi...
			printf("ban can gi nua khong"); // in ra dong nay 
			break; // roi dung 
	}
	return 0; //dung
}

// neu là ki tu thì phai dung 'ki tu'

