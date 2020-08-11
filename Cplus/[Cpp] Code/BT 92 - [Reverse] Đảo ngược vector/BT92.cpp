// reverse algorithm example
#include <iostream>     // std::cout
#include <algorithm>    // std::reverse
#include <vector>       // std::vector
using namespace std;

int main() {
	vector<int> myvector;

	// set some values:
	for ( int i = 1; i < 10; ++i )
		myvector.push_back(i);   // 1 2 3 4 5 6 7 8 9

	reverse(myvector.begin(), myvector.end());    // 9 8 7 6 5 4 3 2 1

	// print out content:
	cout << "myvector contains:";
	for ( vector<int>::iterator it = myvector.begin(); it != myvector.end(); ++it )
		cout << ' ' << *it;
	cout << '\n';
}

/*
myvector contains: 9 8 7 6 5 4 3 2 1
*/