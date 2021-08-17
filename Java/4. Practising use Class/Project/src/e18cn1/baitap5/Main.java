package e18cn1.baitap5;

import e18cn1.baitap4.StackOfIntergers;
import java.util.Scanner;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void primeFactor( StackOfIntergers s, int n ) {
        int i = 2;
        while ( n > 1 )
            if ( n % i == 0 ) {
                s.push(i);
                n = n / i;
            } else
                i++;

        while ( s.isEmpty() == false )
            System.out.print(s.pop() + " ");
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        StackOfIntergers s = new StackOfIntergers();
        System.out.print("n = ");
        int n = sc.nextInt();
        primeFactor(s, n);
        System.out.println("");
    }
}

/*
run:
n = 120
5 3 2 2 2 
*/