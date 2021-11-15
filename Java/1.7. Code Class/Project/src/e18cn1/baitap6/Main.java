package e18cn1.baitap6;

import e18cn1.baitap4.StackOfIntergers;
import java.util.Scanner;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        StackOfIntergers s = new StackOfIntergers();

        System.out.print("Decimal number = ");
        int decNum = sc.nextInt();

        while ( decNum != 0 ) {
            int d = decNum % 2;
            s.push(d);
            decNum /= 2;
        }

        System.out.print("Binary Number: ");
        while ( !( s.isEmpty() ) )
            System.out.print(s.pop());
        System.out.println("\n");
    }
}


/*
run:
Decimal number = 120
Binary Number: 1111000
*/