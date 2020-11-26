package jvprj;

import java.io.*;
import java.util.*;

public class Main {

    public static void main( String[] args ) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(new File("output.txt"));
        output.println("Hello!");
        output.println("Test.");
        
        output.close(); // Nếu không có dòng này thì chỉ xuất hiện 
                        // file output.txt trống
    }
}
