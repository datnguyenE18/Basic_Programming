#include<iostream>
using namespace std;
#include<string>

// khai báo cấu trúc 1 thằng sinh viên
struct sinhvien {
	string maso;
	string hoten;
	float diem_ktlt;
	float diem_trr;
	float diem_ctdlgt;
};
typedef struct sinhvien SINHVIEN;

// khai báo hàm nhập thông tin sinh viên
void Nhap_Thong_Tin_Sinh_Vien ( SINHVIEN & );
// khai báo hàm xuất thông tin sinh viên
void Xuat_Thong_Tin_Sinh_Vien ( SINHVIEN );
// khai báo hàm cắt tên trong chuỗi họ tên
string Cat_Ten ( SINHVIEN );