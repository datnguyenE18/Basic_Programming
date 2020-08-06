#include <iostream>
using namespace std;

int main () {
	// declare an integer number
	int N;
	// input from stdin
	cin >> N;

	int index = 1;

	// print all numbers
	while ( index <= N ) {
		if ( index % 5 == 0 && index++ ) continue;
		cout << index << " ";
		++index;
	}

	system ( "pause" );
	return 0;
}