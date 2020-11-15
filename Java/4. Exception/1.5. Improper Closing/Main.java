package jvprj;

import java.io.*;

public class Main {

    public static void main( String[] args ) {
        try {
            FileInputStream fis = new FileInputStream(new File("song.mp3"));
            int nextByte = fis.read();
            while ( nextByte >= 0 ) {
                System.out.println(nextByte);
                nextByte = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Could not find the file 'song.mp3'.");
        } catch (IOException ioe) {
            System.out.println("Error reading from file!");
        }
    }
}
