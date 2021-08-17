// Ngoại lệ xảy ra

import java.io.IOException;

class ThrowsExample {

    void method() throws IOException {
        throw new IOException("device error");
    }

    public static void main( String args[] ) throws IOException {
        ThrowsExample obj = new ThrowsExample();
        obj.method();
        System.out.println("normal flow...");
    }

}


/*
run:
Exception in thread "main" java.io.IOException: device error
	at jvprj.ThrowsExample.method(Main.java:8)
	at jvprj.ThrowsExample.main(Main.java:13)
C:\Users\Dell\AppData\Local\NetBeans\Cache\8.2rc\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)
*/