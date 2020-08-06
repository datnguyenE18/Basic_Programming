#include<stdio.h>
int main ()
{
	int tuoi=0; //khai bao tuoi
	printf ("nhap tuoi cua ban: "); //in ra man hinh
	scanf ("%d",&tuoi); //yeu cau nhap tuoi
	
	if (tuoi==18) //neu tuoi ban = 18 thi...
		printf("ban vua moi truong thanh"); //in ra dong nay
	else if (tuoi<=18) //neu khong phai thi neu tuoi ban <=18 thi...
		printf("ban con la tre con"); //in ra man hinh dong nay
	else //neu khong thi...
		printf("ban da truong thanh"); //in ra dong nay 
	
	return 0; //dung
}

