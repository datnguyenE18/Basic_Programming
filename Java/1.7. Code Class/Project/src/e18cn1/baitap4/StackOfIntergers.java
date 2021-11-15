package e18cn1.baitap4;

public class StackOfIntergers {

    private int[] elements;
    private int size;

    public StackOfIntergers() {
        this.elements = new int[16];
    }

    public StackOfIntergers( int capacity ) {
        this.size = 0;
        this.elements = new int[capacity];
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

    public void push( int value ) {
        elements[++size] = value;
    }

    public int pop() {
        return ( elements[size--] );
    }

    public int getSize() {
        return size;
    }
}
