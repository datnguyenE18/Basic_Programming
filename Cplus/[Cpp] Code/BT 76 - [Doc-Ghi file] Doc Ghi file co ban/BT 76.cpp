#include<iostream>
#include<fstream>
using namespace std;

void Copy_file ( char *input, char *output ) {
	ifstream fp1; // Khai báo kiểu file chỉ để đọc
	fp1.open ( "input.txt" ); // Mở file input.txt để đọc

	ofstream fp2; // Khai báo biến file chỉ để ghi
	fp2.open ( "output.txt" ); // Mở file để ghi

	char line[225];
	while ( !fp1.eof () ) { // lặp đến cuối file
		fp1.getline ( line, 14 ); // đọc 14 ký tự trong line (Nếu không đếm được dòng có bao nhiêu kí tự, có thể ước lượng rồi để quá ra, hoặc để giới hạn của line là 225 cũng được)
		// Ở đây "Hello World" có 14 kí tự vì hàm fp1.getline lấy cả ký tự NULL or "\0" ở cuối mỗi chuỗi.
		cout << line << endl; // ghi nội dung fp1 ra màn hình

		fp2 << line << endl; //Ghi nội dung dòng line vào fp2
	}

	fp1.close (); // đóng file fp1
	fp2.close ( ); // đóng file fp2
}

int main () {
	Copy_file ( "input.txt", "output.txt" );
	return 0;
}

/* istream& cin.getline(char *str, int n, char delim = '\n'): Đọc dãy ký tự tính cả khoảng trắng vào bộ nhớ do str trỏ tới, quá trình đọc kết thúc khi 
gặp ký tự kết thúc chuỗi '\0' hoặc nhận đủ n-1 ký tự, ký tự Enter được loại bỏ không đưa vào dãy ký tự nhận được */