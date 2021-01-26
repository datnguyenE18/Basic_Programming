package e18cn1.baitap4;

import java.util.Scanner;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static boolean isPrime( int n ) {
        if ( n == 0 || n == 1 )
            return false;
        for ( int i = 2; i <= Math.sqrt(n); i++ )
            if ( n % i == 0 )
                return false;
        return true;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        StackOfIntergers s = new StackOfIntergers();
        for ( int i = 2; i <= n; i++ )
            if ( isPrime(i) )
                if ( s.isFull() == false )
                    s.push(i);
                else {
                    System.out.println("Stack is full!");
                    break;
                }
        while ( s.isEmpty() == false )
            System.out.print(s.pop() + " ");
        System.out.println("");
    }
}

/*
run:
n = 10
7 5 3 2 
*/