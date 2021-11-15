package jvprj;

public class JvPrj {

    public static void main( String[] args ) {
        Student s = new Student("Khanh", 23, "Ha Noi", 9.0);
        s.display();
        System.out.println();
        Teacher t = new Teacher("Tung", 34, "Ha Noi", 1700);
        t.display();
    }

}

/*
run:
Name: Khanh
Age: 23
Address: Ha Noi
GPA: 9.0

Name: Tung
Age: 34
Address: Ha Noi
Salary: 1700
*/
