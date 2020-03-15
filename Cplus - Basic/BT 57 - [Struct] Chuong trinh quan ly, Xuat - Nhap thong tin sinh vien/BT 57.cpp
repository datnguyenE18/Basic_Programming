#include<bits\stdc++.h>
using namespace std;

//declare sinhvien struct
struct sinhvien {
	string name;
	string ID;
	float program_marks;
	float di_maths_marks;
	float algo_marks;
};
typedef struct sinhvien SINHVIEN;

//declare struct save student information
struct danhsach {
	SINHVIEN *ds_sv[100]; //khai báo mảng 1 chiều các con trỏ sinh viên
	int n;
};
typedef struct danhsach DANHSACH;

// Enter student information
void enter_sinhvien_information ( SINHVIEN &sv ) {
	//Enter Full Name:
	do {
		fflush ( stdin );
		cout << "\nEnter full name: "; getline ( cin, sv.name );
	} while ( sv.name.length () > 30 );

	//Enter ID:
	do {
		fflush ( stdin );
		cout << "\nEnter ID: "; getline ( cin, sv.ID );
		if ( sv.ID.length () > 20 ) {
			cout << "\n\tThe length is invalid! Please again!" << endl;
			system ( "pause" );
		}
	} while ( sv.ID.length () > 20 );

	//Enter Programming Techniques Marks:
	do {
		fflush ( stdin );
		cout << "\nEnter Programming Techniques Marks: "; cin >> sv.program_marks;
		if ( sv.program_marks > 10 || sv.program_marks < 0 ) {
			cout << "\n\tThe mark is invalid! Please again" << endl;
			cout << "NOTE: This student violate the rules OR this solution is so great? Please note minus/bonus marks in this form" << endl;
			system ( "pause" );
		}
	} while ( sv.program_marks > 10 || sv.program_marks < 0 );

	//Enter Discrete Mathematics Marks:
	do {
		fflush ( stdin );
		cout << "\nEnter Discrete Mathematics Marks: "; cin >> sv.di_maths_marks;
		if ( sv.di_maths_marks > 10 || sv.di_maths_marks < 0 ) {
			cout << "\n\tThe mark is invalid! Please again" << endl;
			cout << "NOTE: This student violate the rules OR this solution is so great? Please note minus/bonus marks in this form" << endl;
			system ( "pause" );
		}
	} while ( sv.di_maths_marks > 10 || sv.di_maths_marks < 0 );

	//Enter Data Structure & Algorithms Marks:
	do {
		fflush ( stdin );
		cout << "\nData Structure & Algorithms Marks: "; cin >> sv.algo_marks;
		if ( sv.algo_marks > 10 || sv.algo_marks < 0 ) {
			cout << "\n\tThe mark is invalid! Please again" << endl;
			cout << "NOTE: This student violate the rules OR this solution is so great? Please note minus/bonus marks in this form" << endl;
			system ( "pause" );
		}
	} while ( sv.algo_marks > 10 || sv.algo_marks < 0 );
}

// Print student information
void print_sinhvien_information ( SINHVIEN sv ) {
	//Name:
	cout << "\nName: " << sv.name;

	//ID:
	cout << "\nID: " << sv.ID;

	//Programming Techniques Marks:
	cout << "\nProgramming Techniques Marks: " << sv.program_marks;

	//Discrete Mathematics Marks:
	cout << "\nDiscrete Mathematics Marks: " << sv.di_maths_marks;

	//Data Structure & Algorithms Marks:
	cout << "\nData Structure & Algorithms Marks: " << sv.algo_marks << endl;
}

// Print student list
void print_student_list ( DANHSACH ds ) {
	for ( int i = 0; i < ds.n; i++ ) {
		cout << "** The student No." << i + 1 << "**" << endl;
		print_sinhvien_information ( *ds.ds_sv[i] );
		cout << "-----------------------------------------" << endl;
	}
}

//Student list management
void menu ( DANHSACH &ds ) {
	int choice;
	while ( true ) {
		system ( "cls" ); // clear screen
		cout << "\n\n\t\t ========== STUDENT MANAGEMENT ==========";
		cout << "\n\t1. Add student information";
		cout << "\n\t2. Print student list";
		cout << "\n\t0. End.";
		cout << "\n\n\t\t ========== End! ==========";

		cout << "\nYour choice: ";
		cin >> choice;

		if ( choice == 1 ) {
			SINHVIEN *x = new SINHVIEN;
			cout << "\n\n\t\t Enter student information\n";
			enter_sinhvien_information ( *x ); //Add "student x" to one dimension 
			ds.ds_sv[ds.n] = x;
			ds.n++;
		} else if ( choice == 2 ) {
			cout << "\n\n\t\t\tSTUDENT LIST\n";
			print_student_list ( ds );
			system ( "pause" );
		} else break;
	}
	
}

int main () {
	DANHSACH ds;
	ds.n = 0;
	menu ( ds );
	for ( int i = 0; i < ds.n; i++ ) delete ds.ds_sv[i];

	system ( "pause" );
	return 0;
}