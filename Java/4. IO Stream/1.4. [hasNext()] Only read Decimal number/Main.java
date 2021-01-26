import java.io.*;   // for File, FileNotFoundException
import java.util.*; // for Scanner

public class Main {

    public static void main( String[] args ) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        double sum = 0.0;
        while ( sc.hasNext() )
            if ( sc.hasNextDouble() ) {
                double next = sc.nextDouble();
                System.out.println("Decimal number = " + next);
                sum += next;
            } else
                sc.next();
        System.out.println("Sum = " + sum);
    }
}

/*
run:
    Decimal number = 308.2
    Decimal number = 14.9
    Decimal number = 7.4
    Decimal number = 2.8
    Decimal number = 3.9
    Decimal number = 4.7
    Decimal number = -15.4
    Decimal number = 2.8
    Sum = 329.29999999999995
*/