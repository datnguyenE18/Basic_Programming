package jvprj;

public class JvPrj {

    public static void main( String[] args ) {
        Employee s = new Employee("ABC", 2000);
        s.display();
        System.out.println();
        Manager t = new Manager("DEF", 3000, 1500);
        t.display();
    }

}

/*
run:
Name: ABC
Salary: 2000

Name: DEF
Salary: 4500
 */
