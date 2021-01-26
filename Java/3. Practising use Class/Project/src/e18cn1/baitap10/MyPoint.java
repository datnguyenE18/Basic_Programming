package e18cn1.baitap10;

public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
    }

    public MyPoint( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public MyPoint( MyPoint p ) {
        p.x = this.x;
        p.y = this.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance( MyPoint p1 ) {
        return ( Math.sqrt(( p1.x - this.x ) * ( p1.x - this.x ) + ( p1.y - this.y ) * ( p1.y - this.y )) );
    }

    public double distance( MyPoint p1, MyPoint p2 ) {
        return ( Math.sqrt(( p1.x - p2.x ) * ( p1.x - p2.x ) + ( p1.y - p2.y ) * ( p1.y - p2.y )) );
    }

}
