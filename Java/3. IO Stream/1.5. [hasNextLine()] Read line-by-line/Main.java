package jvprj;

import java.io.*;
import java.util.*;

public class Main {

    public static void main( String[] args ) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        while ( input.hasNextLine() ) {
            String line = input.nextLine();
            System.out.println(">" + line);
        }
    }
}

/*
run:
>Hey Prof. Yates,
>
>I would like to know more about files.  Please explain them to me.
>
>Sincerely,
>Susie Q. Student
*/