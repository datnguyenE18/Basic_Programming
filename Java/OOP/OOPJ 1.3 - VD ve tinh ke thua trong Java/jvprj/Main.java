package jvprj;

public class Main {

    public static void main( String[] args ) {
        Cat mommy = new Cat(1, 1, "cde", 1, 1);
        mommy.eat();
        mommy.move();
        mommy.fun();
    }

}

/*
run:
Animal Contruction called
Cat Contruction called
Animal.eat() called
Cat.move() called
Cat.fun() called
*/