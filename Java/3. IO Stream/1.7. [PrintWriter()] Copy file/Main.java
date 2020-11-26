package jvprj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        String ori = keyboard.next(); // Nhập tên file gốc (đã có sẵn)
        String du = keyboard.next(); // Nhập tên file bản sao (có thể đã / chưa có)

        Scanner copier = new Scanner(new File(ori));
        PrintWriter writer = new PrintWriter(new File(du));

        while ( copier.hasNextLine() )
            writer.println(copier.nextLine());

        copier.close();
        writer.close();
    }
}

/*
run:
    origin.txt
    copy.dat
    BUILD SUCCESSFUL (total time: 1 minute 30 seconds)
*/