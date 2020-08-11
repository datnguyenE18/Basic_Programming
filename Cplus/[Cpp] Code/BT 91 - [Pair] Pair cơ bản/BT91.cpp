#include <bits/stdc++.h>
using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b) {
	if ( a.first == b.first ) return a.second < b.second;
	else
		return ( abs(a.first) < abs(b.first) );
}

int main() {
	pair<int, string> pro1;							// default constructor
	pair<string, double> pro2("Apple", 0.99);		// value init
	pair<string, double> pro3(pro2);				// copy constructor
	pair<int, int> pro[5];

	pro1 = make_pair(10, string("Orange"));			//pro1 = make_pair(10, "Orange");
	for ( int i = 0; i < 5; i++ ) {
		cin >> pro[i].first;
		cin >> pro[i].second;
	}

	cout << "pro (before):" << endl;
	for ( int i = 0; i < 5; i++ )
		cout << pro[i].first << ' ' << pro[i].second << endl;
	/* We have:
	pro[0].first	pro[1].first	pro[2].first	pro[3].first	pro[4].first	pro[5].first
	pro[0].second	pro[1].second	pro[2].second	pro[3].second	pro[4].second	pro[5].second
	*/

	sort(pro, pro + 5, cmp);

	cout << "pro1.first =" << pro1.first << endl;
	cout << "pro2 = " << pro2.first << " " << pro2.second << endl;
	cout << "pro3 = " << pro3.first << " " << pro3.second;
	cout << "pro (after):" << endl;
	for ( int i = 0; i < 5; i++ )
		cout << pro[i].first << ' ' << pro[i].second << endl;
}

/*
6 7
-2 5
6 9
10 5
6 1
pro (before):
6 7
-2 5
6 9
10 5
6 1
pro1.first =10
pro2 = Apple 0.99
pro3 = Apple 0.99pro (after):
-2 5
6 1
6 7
6 9
10 5
*/