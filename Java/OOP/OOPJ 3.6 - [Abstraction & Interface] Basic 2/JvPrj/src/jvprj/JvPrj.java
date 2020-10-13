package jvprj;

public class JvPrj {

    public static void main( String[] args ) {
        IShape[] shapes = new IShape[3];
        shapes[0] = new Rectangle(3.4, 5.3);
        shapes[1] = new Circle(5.5);
        shapes[2] = new Rectangle(7.4, 4.3);
        for ( int i = 0; i < 3; i++ ) {
            System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
        }
    }

}

/*
run:
Area of shapes[0]: 18.02
Perimeter of shapes[0]: 17.4
Area of shapes[1]: 94.985
Perimeter of shapes[1]: 34.54
Area of shapes[2]: 31.82
Perimeter of shapes[2]: 23.4
 */
