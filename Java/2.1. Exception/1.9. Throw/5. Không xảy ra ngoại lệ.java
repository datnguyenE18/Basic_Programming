/*Ví dụ: tạo ra phương thức validate() với tham số truyền vào là giá trị integer. Nếu tuổi dưới 18, chúng ta ném ra ngoại lệ ArithmeticException nếu không in ra một thông báo “welcome”.*/
class Ex {

    static void validate( int age ) {
        if ( age < 18 )
            throw new ArithmeticException("Error!");
        else
            System.out.println("welcome to vote");
    }

    public static void main( String args[] ) {
        validate(20);
        System.out.println("rest of the code...");
    }
}

/*
run:
welcome to vote
rest of the code...
*/
