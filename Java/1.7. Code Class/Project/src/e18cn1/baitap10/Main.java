package e18cn1.baitap10;

import java.util.Scanner;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        MyPoint[] p = new MyPoint[n];

        int u = 0, v = 0;
        double max = 0;

        for ( int i = 0; i < n; i++ ) {
            System.out.print("Diem thu " + (i + 1) + " : ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            p[i] = new MyPoint(x, y);
        }

        for ( int i = 0; i < n; i++ )
            for ( int j = i + 1; j < n; j++ )
                if ( p[i].distance(p[j]) > max ) {
                    max = p[i].distance(p[j]);
                    u = i;
                    v = j;
                }
        
        System.out.println("Max Distance: " + max + " is: " + u + " & " + v);
    }
}

/*
run:
n = 5
Diem thu 1 : 2 3
Diem thu 2 : 5 4
Diem thu 3 : 1 2
Diem thu 4 : 6 8
Diem thu 5 : 1 5
Max Distance: 7.810249675906654 is: 2 & 3
*/