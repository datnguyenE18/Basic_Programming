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

/*
	+) Có thể sử dụng cấu trúc như là một đối số, và có thể sử dụng structure như một kiểu dữ liệu của hàm và 
		return giá trị của structure đó. Có thể sử dụng các operator (=) để gán một giá trị của struct cho một 
		biến khác cùng với kiểu đã khai báo. 
*/