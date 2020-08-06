#include<iostream>
using namespace std;
#include<string> // khai báo thư viện chuỗi bên C++



// =================== KHAI BÁO CẤU TRÚC 1 SINH VIÊN ===================
struct sinhvien {
	string hoten;
	string mssv;
	float diemtb;

};
typedef struct sinhvien SinhVien; // đổi tên struct sinhvien thành SinhVien - để khi chạy trên trình biên dịch thuần C nó sẽ không bị lỗi


//==========================================================

// =================== KHAI BÁO CẤU TRÚC NHIỀU	SINH VIÊN - DANH SÁCH SINH VIÊN ===================
struct danhsach {
	SinhVien arr[100]; // khai báo ra mảng 1 chiều các sinh viên - chứa tối đa 100 sinh viên
	int n; // số lượng sinh viên hiện có trong danh sách
};

typedef struct danhsach DanhSach;

// hàm nhập thông tin 1 sinh viên
void Nhap_Thong_Tin_1_Sinh_Vien ( SinhVien &sv ) {
	// vòng lặp nhập họ tên sinh viên
	do {
		fflush ( stdin ); // xóa bộ đệm
		cout << "\nNhap ho ten sinh vien: ";	getline ( cin, sv.hoten );
		if ( sv.hoten.length () > 30 ) 	cout << "\nHo ten toi da 30 ki tu. Xin kiem tra lai";
	} while ( sv.hoten.length () > 30 );

	// vòng lặp nhập mã số sinh viên
	do {
		fflush ( stdin ); // xóa bộ đệm
		cout << "\nNhap ma so sinh vien: ";		getline ( cin, sv.mssv );
		if ( sv.mssv.length () > 10 ) 	cout << "\nMa so sinh vien toi da 10 ki tu. Xin kiem tra lai";
	} while ( sv.mssv.length () > 10 );

	do {
		// nhập điểm cho sinh viên
		cout << "\nNhap diem trung binh sinh vien: ";	cin >> sv.diemtb;
		if ( sv.diemtb < 0 || sv.diemtb > 10 )	cout << "\nDiem trung binh khong duoc < 0 hay > 10";
	} while ( sv.diemtb < 0 || sv.diemtb > 10 );
}

// hàm xuất thông tin 1 sinh viên
void Xuat_Thong_Tin_1_Sinh_Vien ( SinhVien sv ) {
	// xuất họ tên sinh viên
	cout << "\nHo ten sinh vien: " << sv.hoten;

	// xuất mã số sinh viên
	cout << "\nMa so sinh vien: " << sv.mssv;

	// xuất điểm sinh viên
	cout << "\nDiem trung binh sinh vien: " << sv.diemtb;
}

// hàm nhập danh sách sinh viên
void Nhap_Danh_Sach_Sinh_Vien ( DanhSach &ds ) {
	// vòng lặp cho chúng ta nhập nhiều thằng sinh viên
	for ( int i = 0; i < ds.n; i++ ) {
		cout << "\n\t\t NHAP THONG TIN SINH VIEN THU " << i + 1 << endl;
		// gọi lại hàm nhập thông tin 1 thằng sinh viên
		// nhập thông tin sinh viên thứ arr[i]
		Nhap_Thong_Tin_1_Sinh_Vien ( ds.arr[i] );
	}
}

// hàm xuất danh sách sinh viên
void Xuat_Danh_Sach_Sinh_Vien ( DanhSach ds ) {
	// vòng lặp cho chúng ta xuất ra nhiều sinh viên
	for ( int i = 0; i < ds.n; i++ ) {
		cout << "\n\t\tTHONG TIN SINH VIEN THU " << i + 1 << endl;
		// gọi lại hàm xuất thông tin 1 sinh viên
		// xuất thông tin sinh viên thứ arr[i]
		Xuat_Thong_Tin_1_Sinh_Vien ( ds.arr[i] );
	}
}

// tìm ra điểm trung bình cao nhất
float Tim_Diem_Trung_Binh_Cao_Nhat ( DanhSach ds ) {
	int max = ds.arr[0].diemtb;
	for ( int i = 1; i < ds.n; i++ ) {
		if ( ds.arr[i].diemtb > max ) {
			max = ds.arr[i].diemtb;
		}
	} return max;
}

// trả về sinh viên có điểm trung bình thấp nhất
void Tim_Sinh_Vien_Diem_Trung_Binh_Thap_Nhat ( DanhSach ds ) {
	// BƯỚC 1: duyệt danh sách sinh viên và tìm ra điểm trung bình thấp nhất
	int min = ds.arr[0].diemtb;
	for ( int i = 1; i < ds.n; i++ ) {
		if ( ds.arr[i].diemtb < min ) {
			min = ds.arr[i].diemtb;
		}
	}

	// BƯỚC 2: Duyệt danh sách sinh viên - nếu thằng nào có điểm trung bình bằng với min thì xuất 
	for ( int i = 0; i < ds.n; i++ ) {
		if ( ds.arr[i].diemtb == min ) {
			// xuất ra thông tin sinh viên thứ i
			Xuat_Thong_Tin_1_Sinh_Vien ( ds.arr[i] );
		}
	}
}

int main () {
	DanhSach ds; // khai báo struct danh sách sinh viên

	cout << "\nNhap so luong sinh vien: ";
	cin >> ds.n; // nhập giá trị cho biến n

	cout << "\n\n\n\t\tNHAP DANH SACH SINH VIEN\n";
	Nhap_Danh_Sach_Sinh_Vien ( ds ); // nhập danh sách sinh viên
	cout << "\n\n\n\t\tXUAT DANH SACH SINH VIEN";
	Xuat_Danh_Sach_Sinh_Vien ( ds );

	float max = Tim_Diem_Trung_Binh_Cao_Nhat ( ds );
	cout << "\n\n\tDiem trung binh cao nhat la: " << max;
	cout << "\n\n\t\t DANH SACH SINH VIEN CO DIEM TRUNG BINH THAP NHAT\n";
	Tim_Sinh_Vien_Diem_Trung_Binh_Thap_Nhat ( ds );
	system ( "pause" );
	return 0;
}