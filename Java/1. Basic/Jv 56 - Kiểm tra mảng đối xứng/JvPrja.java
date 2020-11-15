import java.util.*;

public class JvPrja {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt(),
                    a[] = new int[n];
            boolean check = true;

            // Nhập mảng:
            for ( int i = 0; i < n; i++ ) {
                a[i] = sc.nextInt();
            }

            // Kiểm tra mảng:
            for ( int i = 0; i < n / 2; i++ ) {
                if ( a[i] != a[n - i - 1] ) {
                    check = false;
                    break;
                }
            }

            // Result:
            if ( check ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
