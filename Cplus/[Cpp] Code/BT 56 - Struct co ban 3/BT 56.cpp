#include <bits/stdc++.h>
using namespace std;

struct inflatable {
	char name[20];
	float volume;
	double price;
};
int main ( ) {
	inflatable guests[2] = // array of 2 inflatable structures, Đây là dòng lệnh để tạo ra một mảng có 2 phần tử kiểu > inflatable. Vì thế mỗi phần tử trong mảng từ guests[0] tới guests[1] đều có kiểu của struct inflatable:
	{
		{ "Bambi", 0.5, 21.99 },	//giá trị đầu tiên của mảng
		{ "Rambo", 2000, 565.99 }	//giá trị tiếp theo(giá trị cuối) của mảng
	};
	cout << "The guests " << guests[0].name << " and " << guests[1].name; //// use name member of first (0) & last (1) struct
	cout << "\nHave a combined volume of " << guests[0].volume + guests[1].volume << " cubic feet.\n";
	
	system ( "pause" );
	return 0;
}
