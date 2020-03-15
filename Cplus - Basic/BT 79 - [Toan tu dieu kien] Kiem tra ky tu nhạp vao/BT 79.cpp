#include <bits\stdc++.h>

using namespace std;

int main ( ) {
	// Declare a char variable
	char character;
	// Read and save a variable from keyboard
	cin >> character;
	string str;
	// Check type of character using conditional operator
	str = ( character >= '0' && character <= '9' ) ? "It is a numberic character" : ( character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z' ) ? "It is an alphabet character" : "It is a special character";
	cout << str << endl;
	
	system("pause");
	return 0;
}
