#include <bits/stdc++.h> 
using namespace std;

int main () {
	string string1, string2;
	cin >> string1 >> string2;

	// check substring
	bool isSubstring;
	isSubstring = ( string1.find ( string2 ) != -1 ) ? true : false;

	if ( isSubstring ) {
		cout << "string2 is a substring of string1";
	} else {
		cout << "string2 is not a substring of string1";
	}

	system ( "pause" );
	return 0;
}