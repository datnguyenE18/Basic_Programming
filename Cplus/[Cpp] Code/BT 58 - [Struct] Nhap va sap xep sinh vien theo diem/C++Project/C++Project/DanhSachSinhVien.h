#include"ThongTinSinhVien.h"

// khai báo cấu trúc danh sách sinh viên
struct danhsach {
	SINHVIEN dssv[100];// khai báo mảng 1 chiều tĩnh chứa tối đa 100 sinh viên
	int n; // số lượng sinh viên
};
typedef struct danhsach DANHSACH;

// khai báo hàm nhập danh sách sinh viên
void Nhap_Danh_Sach_Sinh_Vien ( DANHSACH & );
// khai báo hàm xuất danh sách sinh viên
void Xuat_Danh_Sach_Sinh_Vien ( DANHSACH );
// khai báo hàm sắp xếp danh sách sinh viên giảm dần theo tên
void Sap_Xep_Giam_Dan_Theo_Ten ( DANHSACH & );