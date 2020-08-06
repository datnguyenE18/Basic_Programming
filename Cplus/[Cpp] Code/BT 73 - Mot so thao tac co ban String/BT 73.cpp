#include<iostream>
#include<string>
using namespace std;

int main () {
	string s1 = "Hello";
	string s2 = "Viet Nam";

	//Nối xâu s1 vào xâu s2
	cout << "+) s1 + s2 = " << s1 + " " + s2 << endl;

	// Tính độ dài xâu s1
	cout << "\n+) Do dai s1= " << s1.length () << endl;

	// copy xâu s2 vào xâu s3
	string s3 = s2;
	cout << "\n+) So sanh s2 & s3 truoc khi dao s2= " << s2.compare ( s3 ) << endl; 

	// Đảo ngược xâu s2 
	reverse ( s2.begin (), s2.end () );
	cout << "\n+) Xau s2 dao= " << s2 << endl; // In ra xâu s2 đã bị đảo ngược

	cout << "\n+) Xau s3 copy tu xau s2: " << s3 << endl;

	cout << "\n+) So sanh s1 & s2= " << s1.compare ( s2 ) << endl;
	cout << "\n+) So sanh s2 & s1= " << s2.compare ( s1 ) << endl;
	cout << "\n+) So sanh s2 & s3 sau khi dao s2= " << s2.compare ( s3 ) << endl;

	system ( "pause" );
	return 0;
}

/*So sánh a và b theo a.compare ( b ): 
	+) Nếu a < b thì trả về -1 
	+) Nếu a = b thì trả về 0
	+) Nếu a > b thì trả về 1*/