package e18cn1.baitap11;

import e18cn1.baitap10.MyPoint;
import java.util.Scanner;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        MyPoint[] p = new MyPoint[3];

        for ( int i = 0; i < 3; i++ ) {
            System.out.print("Point " + ( i + 1 ) + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            p[i] = new MyPoint(x, y);
        }
        check(p);
    }

    static void check( MyPoint[] p ) {
        double d01 = p[0].distance(p[1]);
        double d02 = p[0].distance(p[2]);
        double d12 = p[1].distance(p[2]);

        if ( d01 + d02 > d12 && d01 + d12 > d02 && d12 + d02 > d01 )
            if ( d01 == d02 && d01 == d12 && d02 == d12 )
                System.out.println("Equilateral triangle!");
            else if ( Math.pow(d01, 2) + Math.pow(d02, 2) == Math.pow(d12, 2)
                      || Math.pow(d01, 2) + Math.pow(d12, 2) == Math.pow(d02, 2)
                      || Math.pow(d02, 2) + Math.pow(d12, 2) == Math.pow(d01, 2) )
                if ( d01 == d02 || d01 == d12 || d02 == d12 )
                    System.out.println("Square_isosceles triangle!");
                else
                    System.out.println("Square triangle!");
            else if ( d01 == d02 || d01 == d12 || d02 == d12 )
                System.out.println("Isosceles triangle!");
            else
                System.out.println("A general triangle!");
        else
            System.out.println("Not a triangle!");
    }
}

/*
run:
Point 1: 5 6
Point 2: 2 6
Point 3: 7 8
A general triangle!
*/