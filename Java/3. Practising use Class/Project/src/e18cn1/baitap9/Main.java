package e18cn1.baitap9;

import java.util.Scanner;
import e18cn1.baitap7.StackOfChars;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("KQ: ");
        StackOfChars res = trans(n, b);
        while ( !( res.isEmpty() ) )
            System.out.print(res.pop());
        System.out.println("\n");
    }

    static StackOfChars trans( int n, int b ) {
        StackOfChars s = new StackOfChars();
        int x = 0;
        while ( n > 0 ) {
            x = n % b;
            n /= b;
            if ( b == 16 ) {
                if ( x == 10 )
                    s.push('A');
                if ( x == 11 )
                    s.push('B');
                if ( x == 12 )
                    s.push('C');
                if ( x == 13 )
                    s.push('D');
                if ( x == 14 )
                    s.push('E');
                if ( x == 15 )
                    s.push('F');
                if ( 0 <= x && x < 10 )
                    s.push((char) x);
            } else
                s.push((char) x);
        }
        return s;
    }
}

/*
run:
n = 980
b = 2
KQ: 1111010100
*/