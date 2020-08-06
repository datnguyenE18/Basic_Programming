#include <bits/stdc++.h> 
using namespace std;

int main () {
	string inputString;
	cin >> inputString;

	//check palindrome
	bool isPalindrome = true;
	for ( int i = 0; i < inputString.length () / 2; i++ ) {
		if ( inputString[i] != inputString[inputString.length () - i - 1] ) {
			isPalindrome = false;
		}
	}

	if ( isPalindrome ) {
		cout << "It is a palindrome string";
	} else {
		cout << "It is not a palindrome string";
	}

	system ( "pause" );
	return 0;
}