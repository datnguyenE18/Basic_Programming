import java.util.*;	// For Scanner class
import java.io.*;

public class Main {

    public static void main( String[] args ) {
        try {
            File inputFile = new File("student.txt");
            Scanner input = new Scanner(inputFile);
            PrintWriter pw = new PrintWriter(new File("quoted.txt"));

            while ( input.hasNextLine() )
                pw.println("> " + input.nextLine());
        } catch (FileNotFoundException exception) {
            System.out.println("Could not find the input file.");
            System.out.println(exception.getLocalizedMessage());
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("Could not write to file 'quoted.txt'.");
        }
    }
}

/*
run:
Could not find the input file.
student.txt (The system cannot find the file specified)
java.io.FileNotFoundException: student.txt (The system cannot find the file specified)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(FileInputStream.java:195)
	at java.io.FileInputStream.<init>(FileInputStream.java:138)
	at java.util.Scanner.<init>(Scanner.java:611)
	at jvprj.Main.main(Main.java:11)
*/