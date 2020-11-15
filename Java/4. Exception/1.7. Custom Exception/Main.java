package jvprj;

// Tạo ngoại lệ tùy chỉnh thuộc loại checked exception:
class InvalidAgeException extends Exception {

    InvalidAgeException( String s ) {
        super(s);
    }
}

// Sử dụng ngoại lệ tùy chỉnh:
public class Main {

    static void validate( int age ) throws InvalidAgeException {
        if ( age < 18 )
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main( String args[] ) {
        try {
            validate(13);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }

        System.out.println("rest of the code...");
    }
}

/*
run:
Exception occured: jvprj.InvalidAgeException: not valid
rest of the code...
*/