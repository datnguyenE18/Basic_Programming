import java.util.*;	// For Scanner class
import java.io.*;

public class Main {

    public static void main( String[] args ) {
        try {
            File inputFile = new File("student.txt");
            Scanner input = new Scanner(inputFile);

            while ( input.hasNextLine() )
                System.out.println("> " + input.nextLine());
        } catch (FileNotFoundException exception) {
            System.out.println("Could not find the file 'student.txt'.");
            System.out.println(exception.getLocalizedMessage());
            //exception.printStackTrace();
            exception.printStackTrace();
        }
    }
}

/*
run:
Could not find the file 'student.txt'.
java.io.FileNotFoundException: student.txt (The system cannot find the file specified)
student.txt (The system cannot find the file specified)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(FileInputStream.java:195)
	at java.io.FileInputStream.<init>(FileInputStream.java:138)
	at java.util.Scanner.<init>(Scanner.java:611)
	at jvprj.Main.main(Main.java:11)
*/
