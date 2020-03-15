#include<bits/stdc++.h>
using namespace std;

/*Con trỏ This bản chất là địa chỉ của một Objectb (một thực thể) của Class*/

class BanhCanh {
	public:
	BanhCanh ( int soTo ) {
		this->soTo = soTo; //This đã phân biệt 2 số tô khác nhau
	}
	void PrintThisPointer () {
		cout << this << endl;
	}
	private:
	int soTo; // số tô bánh canh :)))
};

int main () {
	BanhCanh banhcanhHe(1); // 1 tô bánh canh Hẹ
	cout << &banhcanhHe << endl; // in ra địa chỉ của Bánh Canh Hẹ (banhcanhHe)
	banhcanhHe.PrintThisPointer ();

	system ( "pause" );
	return 0;
}