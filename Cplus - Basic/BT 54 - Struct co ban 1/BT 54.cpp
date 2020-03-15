#include <iostream>
using namespace std;

struct inflatable {
	char name[20];
	float volume;
	double price;
};

int main () {
	inflatable bouquet =
	{
		"sunflower",
		0.20,
		12.49
	};
	inflatable pal =
	{
		"Audacious Arthur",
		3.12,
		32.99
	};
	inflatable choice;
	cout << "bouquet: " << bouquet.name << "for $" << bouquet.price << endl;
	choice = bouquet;
	cout << "choice: " << choice.name << "for $" << choice.price << endl;

	system ( "pause" );
	return 0;
}

/*	+) Struct chúng ta cũng có thể gọi nó là 1 kiểu dữ liệu được định nghĩa riêng. Điều này cũng có nghĩa rằng nó ó dạng “Biến nội bộ” và “Biến toàn cục”. 
		Dựa vào vị trí đặt của Struct thì chúng cũng chúng ta có thể suy ra đươc biến Struct này là biến nội bộ hay biến toàn cục.
		Tùy vào vị trí đặt Struct thì chúng ta có cách sử dụng khác nhau 
	
	Struct cũng được máy tính đối xử như 1 biến vậy, nó có thể được khai báo cục bộ hoặc toàn cục
	+) Biến Struct toàn cục: là loại biến đặt bên ngoài hàm, được khai báo sau khi khai báo thư viện và namspace, loại biến này sử dụng được 
		cho mọi hàm trong chương trình và chúng ta gọi tên tiếng anh là external declaration. 
	   Biến Struct cục bộ: là loại biến được đặt bên trong hàm, được khai báo trong 1 hàm cố định và không được truy xuất bởi hàm khác, nói 
	    cách khác đó là biến chỉ sử dụng được bởi các funtion đặt chung dấu {} với nó.
	
	+) Với ngôn ngữ C++, ngôn ngữ này không khuyến khích sử dụng biến toàn cục (external variable) nhưng nó khuyến khích sử dụng các struct 
		extenal variable (có thể gọi là cấu trúc toàn cục).
*/