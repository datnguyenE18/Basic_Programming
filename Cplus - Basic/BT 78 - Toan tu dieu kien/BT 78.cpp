#include <iostream>
#include <string>
using namespace std;

int main () {
	// Declare a char variable
	char character;
	// Read and save a variable
	cin >> character;
	string str;
	// Check "A" character using conditional operator
	str = character == 'A' ? "It is an A character" : "It is not an A character";
	cout << str << endl;

	system ( "pause" );
	return 0;
}
