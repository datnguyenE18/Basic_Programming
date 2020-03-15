// gọi lại thư viện do chúng ta định nghĩa
#include"thuviencuatoi.h"

// giải phương trình bậc 2


int main () {
	Giai_Phuong_Trinh_Bac_2 ( 1, 4, 5 );

	system ( "pause" );
	return 0;
}

/*
TRONG CHƯƠNG TRÌNH SẼ CÓ 2 FILE
1. file có đuôi .h - hay còn gọi là file thư viện
+ file thư viện do ngôn ngữ lập trình tạo ra sẵn - và chúng ta sẽ gọi để dùng
- stdio.h: file thư viện hỗ trợ việc nhập xuất chuẩn
- conio.h:
- math.h: file thư viện hỗ trợ các hàm toán học: sqrt(), pow(), sin(), cos().....
- string.h: file thư viện hỗ trợ các hàm thao tác trên chuỗi: strlen(), strcpy()....
..........
+ file thư viện do người lập trình tạo nên 
==> đáp ứng 1 số công việc nào đó cho người lập trình viên
file .h

KẾT LUẬN: file .h sẽ là file chứa các KHAI BÁO của các cái hàm 
 

2. file có đuôi .cpp
==> file .cpp sẽ là file chứa các ĐỊNH NGHĨA của các hàm ở trong file .h



VD:
thuviencuatoi.h - file này chứa các khai báo hàm mà chúng ta sẽ dùng
- KHAI BÁO hàm kiểm tra số nguyên tố
bool Kiem_Tra_So_Nguyen_To(int n);
- KHAI BÁO hàm kiểm tra số hoàn thiện
bool Kiem_Tra_So_Hoan_Thien(int n);
- KHAI BÁO hàm giải phương trình bậc 2
void Gia_Phuong_Trinh_Bac_2(float a, float b, float c);

==================
thuviencuatoi.cpp - định nghĩa các hàm đã khai báo trong file thuviencuatoi.h*/