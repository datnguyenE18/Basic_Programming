package jvprj;

public class JvPrj {

    public static void main( String[] args ) {
        Person person1 = new Employee("Trung", "HN", 3300);
        Person person2 = new Customer("Linh", "BN", 10400);
        person1.display();
        person2.display();
    }

}

/*
run:
Employee name: Trung
Employee address: HN
Employee salary: 3300
Customer name: Linh
Customer address: BN
Customer balance: 10400
*/
