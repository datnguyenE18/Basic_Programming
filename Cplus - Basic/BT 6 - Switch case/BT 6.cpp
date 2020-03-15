#include<iostream>
using namespace std;
int main(int argc, char **argv)
{
	int luachon;
	// đoạn code tạo menu
	cout << "\n\n\t\t ============== Menu ==============";
	cout << "\n1. Tinh cam";
	cout << "\n2. Kinh di";
	cout << "\n3. XXX";
	cout << "\n4. Khoa hoc - Vien tuong";
	cout << "\n\n\t\t ============== End ==============";
	// yêu cầu người dùng nhập lựa chọn
	cout << "\nNhap lua chon(1 --> 4): ";
	cin >> luachon;
	// câu trúc switch
	switch (luachon)
	{
	case 1:
	{
			  cout << "\nBan da chon the loai phim 'Tinh cam' ";
	}break;
	case 2:
	{
			  cout << "\nBan da chon the loai phim 'Kinh di' ";
	}break;
	case 3:
	{
			  cout << "\nBan da chon the loai phim 'XXX' ";
	}break;
	case 4:
	{
			  cout << "\nBan da chon the loai phim 'Khoa hoc - Vien tuong' ";
	}break;
	default:
	{
			   cout << "\nLua chon khong hop le. Xin vui long kiem tra lai";
	}
	}
	system("pause");
	return 0;
}