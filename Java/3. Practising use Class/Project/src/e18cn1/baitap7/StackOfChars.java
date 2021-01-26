package e18cn1.baitap7;

public class StackOfChars {

    private char[] elements;
    private int size;

    public StackOfChars() {
        this.elements = new char[16];
    }

    public StackOfChars( int capacity ) {
        this.size = 0;
        this.elements = new char[capacity];
    }

    public boolean isEmpty() {
        return ( size == 0 );
    }

    public boolean isFull() {
        return ( size == elements.length );
    }

    public int peak() {
        return elements[size];
    }

    public void push( char value ) {
        elements[++size] = value;
    }

    public int pop() {
        return ( elements[size--] );
    }

    public int getSize() {
        return size;
    }
}
