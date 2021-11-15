package jvprj;

import java.io.IOException;

class ThrowsExample {

    void method() throws IOException {
        throw new IOException("device error");
    }

    public static void main( String args[] ) {
        try {
            ThrowsExample obj = new ThrowsExample();
            obj.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }

}

/*
run:
    exception handled
    normal flow...
*/
