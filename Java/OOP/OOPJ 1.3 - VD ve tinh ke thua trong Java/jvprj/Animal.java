package jvprj;

public class Animal {

    private int weight;
    private int size;
    private String name;

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move() {
        System.out.println("Animal.move() called");
    }

    public void fun() {
        System.out.println("Animal.fun() called");
    }

    public int getWeight() {
        return weight;
    }

    public Animal( int weight, int size, String name ) {
        super();
        System.out.println("Animal Contruction called");

        this.weight = weight;
        this.size = size;
        this.name = name;
    }

    public void setWeight( int weight ) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize( int size ) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
