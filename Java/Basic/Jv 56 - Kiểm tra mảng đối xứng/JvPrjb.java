package jvprj;

import java.util.Scanner;

public class JvPrjb {

    private static void input( long[] a, int n ) {
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < n; i++ ) {
            a[i] = sc.nextLong();
        }
    }

    private static boolean check( long[] a, int n ) {
        int st = 0, en = n - 1;
        while ( st < en ) {
            if ( a[st] != a[en] ) {
                return false;
            }
            st++;
            en--;
        }
        return true;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            long[] a = new long[n];
            input(a, n);
            if ( check(a, n) ) {
                System.out.println("YES\n");
            } else {
                System.out.println("NO\n");
            }
        }
    }
}
