package jvprj;

class Employee {

    private int id;
    private int salary;
    private String firstName;
    private String lastName;

    public Employee( int id, String firstName, String lastName, int salary ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary( int salary ) {
        this.salary = salary;
    }
}

public class JvPrj {

    public static void main( String[] args ) {
        Employee e = new Employee(1, "Kien", "Hoang", 1000);
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getFullName());
        System.out.println("Salary: " + e.getSalary());
    }
}

/*
run:
Id: 1
Name: Kien Hoang
Salary: 1000
 */
