import java.io.*;   // for File, FileNotFoundException
import java.util.*; // for Scanner

public class Main {

    public static void main( String[] args ) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        double sum = 0.0;
        while ( input.hasNextDouble() ) {
            double next = input.nextDouble();
            System.out.println("number = " + next);
            sum += next;
        }
        System.out.println("Sum = " + sum);
    }
}

/*
run:
    number = 308.2
    number = 14.9
    number = 7.4
    number = 2.8
    number = 3.9
    Sum = 337.19999999999993
*/

/*
run:
    number = 308.2
    number = 14.9
    number = 7.4
    number = 2.8
    number = 3.9
    number = 4.7
    number = -15.4
    number = 2.8
    Sum = 329.29999999999995
*/