package jvprj;

abstract class Human {

    abstract void show();
}

class Person extends Human {

    private String name;
    private int age;

    public Person() {
        super();
        name = "";
        age = 0;
    }

    public Person( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    @Override
    public void show() {
        System.out.println(name + " is " + age + " years old!");
    }

}

class Employee extends Person {

    private float salary;

    public Employee() {
        super();
        salary = 0;
    }

    public Employee( String name, int age, float salary ) {
        super(name, age);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary( float salary ) {
        this.salary = salary;
    }

    @Override
    public void show() {
        System.out.println(getName() + " is " + getAge() + " years old having a salary of $" + salary + "/month!");
    }

    public void addSalary() {
        salary = (float) ( salary + ( salary * 0.1 ) );
    }

    public void addSalary( float addition ) {
        salary += addition;
    }
}

public class JvPrj {

    public static void main( String args[] ) {
        Person myPerson = new Person("Vinh", 25);
        myPerson.show();

        Employee myEmployee = new Employee("Vinh", 25, 300);
        myEmployee.show();

        myEmployee.addSalary();
        myEmployee.show();

        myEmployee.addSalary(50);
        myEmployee.show();
    }

}

/*
run:
Vinh is 25 years old!
Vinh is 25 years old having a salary of $300.0/month!
Vinh is 25 years old having a salary of $330.0/month!
Vinh is 25 years old having a salary of $380.0/month!
*/