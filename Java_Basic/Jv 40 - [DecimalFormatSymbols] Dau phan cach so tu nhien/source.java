import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class source {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		DecimalFormat dcf = new DecimalFormat("#,###");
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
		dfs.setGroupingSeparator(',');
		dcf.setDecimalFormatSymbols(dfs);
		System.out.println(dcf.format(n));
	}
}