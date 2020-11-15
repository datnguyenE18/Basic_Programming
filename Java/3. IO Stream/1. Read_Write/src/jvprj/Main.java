package jvprj;

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
        }
    }
}
