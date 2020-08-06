#include<bits/stdc++.h>
using namespace std;

/*Con trỏ This bản chất là địa chỉ của một Objectb (một thực thể) của Class*/

class BanhCanh {
	public:
	void PrintThisPointer () {
		cout << this << endl;
	}
};

int main () {
	BanhCanh banhcanhHe; //banhcanhHe là một thực thể của Class(lớp) BanhCanh
	//=> con trỏ This là địa chỉ của banhcanhHe
	cout << &banhcanhHe << endl; // in ra địa chỉ của Bánh Canh Hẹ (banhcanhHe)
	banhcanhHe.PrintThisPointer ();
	//Chạy chương trình => con trỏ This là địa chỉ của banhcanhHe
	system ( "pause" );
	return 0;
}