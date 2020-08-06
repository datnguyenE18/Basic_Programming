/* Thông tin sinh viên gồm:
+ Họ tên
+ Mã số sinh viên:
+ điểm
1. Nhập thông tin 1 sinh viên - Xuất ra màn hình thông tin của sinh viên
*/

#include<iostream>
#include<string> // khai báo thư viện chuỗi bên C++

using namespace std;

// =================== KHAI BÁO CẤU TRÚC SINH VIÊN ===================
struct sinhvien {
string hoten;
string mssv;
float diem;
};

typedef struct sinhvien SinhVien; // định nghĩa "struct sinhvien" thành SinhVien - để khi chạy trên trình biên dịch thuần C (file.c) nó sẽ không bị lỗi

//==========================================================
// hàm nhập thông tin sinh viên:
void Nhap_thong_tin_1_sinhvien ( SinhVien &sv ) {
// nhập họ tên cho sinh viên
fflush ( stdin ); // xóa bộ đệm
cout << "\nNhap ho ten sinh vien: ";
getline ( cin, sv.hoten ); //chấm "." là một toán tử để truy xuất đến một thành phần bất kì trong một struct nào đó thông qua tên biến "sv"

// nhập mã số sinh viên
fflush ( stdin ); // xóa bộ đệm
cout << "\nNhap ma so sinh vien: ";
getline ( cin, sv.mssv );

// nhập điểm cho sinh viên
cout << "\nNhap diem sinh vien: ";
cin >> sv.diem;
}

// hàm xuất thông tin sinh viên
void Xuat_Thong_Tin_1_Sinh_Vien ( SinhVien sv ) {
// xuất họ tên sinh viên
cout << "\nHo ten sinh vien: " << sv.hoten;

// xuất mã số sinh viên
cout << "\nMa so sinh vien: " << sv.mssv;

// xuất điểm sinh viên
cout << "\nDiem sinh vien: " << sv.diem;
}

int main () {
SinhVien x; // khai báo ra 1 sinh viên x
SinhVien y; // khai báo ra 1 sinh vien y
SinhVien z; // khai báo ra 1 sinh vien y

cout << "\n\n\t\t NHAP THONG TIN SINH VIEN x\n";
Nhap_thong_tin_1_sinhvien ( x );
cout << "\n\n\t\t NHAP THONG TIN SINH VIEN y\n";
Nhap_thong_tin_1_sinhvien ( y );
cout << "\n\n\t\t THONG TIN SINH VIEN z giống x:\n";
z = x; // phép toán ghép 2 cấu trúc được thực hiện

cout << "\n\n\t\t THONG TIN SINH VIEN x \n";
Xuat_Thong_Tin_1_Sinh_Vien ( x );
cout << "\n\n\t\t THONG TIN SINH VIEN y\n";
Xuat_Thong_Tin_1_Sinh_Vien ( y );
cout << "\n\n\t\t THONG TIN SINH VIEN z\n";
Xuat_Thong_Tin_1_Sinh_Vien ( z );


system ( "pause" );
return 0;
}


