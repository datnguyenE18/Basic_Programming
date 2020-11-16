/*Ví dụ: tạo ra phương thức validate() với tham số truyền vào là giá trị integer. Nếu tuổi dưới 18, chúng ta ném ra ngoại lệ ArithmeticException nếu không in ra một thông báo “welcome”.*/

public class Ex {

    static void validate( int age ) {
        if ( age < 18 )
            throw new ArithmeticException("Error!");
        else
            System.out.println("welcome to vote");
    }

    public static void main( String args[] ) {
        validate(13);
        System.out.println("rest of the code...");
    }
}

/*
run:
Exception in thread "main" java.lang.ArithmeticException: Error!
	at jvprj.Main.validate(Main.java:7)
	at jvprj.Main.main(Main.java:13)
C:\Users\Dell\AppData\Local\NetBeans\Cache\8.2rc\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)
*/