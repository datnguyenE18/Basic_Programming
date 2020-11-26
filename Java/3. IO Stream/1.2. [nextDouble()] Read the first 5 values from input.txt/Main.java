import java.io.*;
import java.util.*;

public class Main {

    public static void main( String args[] ) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        double sum = 0.0;

        for ( int i = 1; i <= 5; i++ ) {
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
input.txt
308.2
   14.9 7.4  2.8

3.9 4.7    -15.4
    2.8
*/