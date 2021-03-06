import java.text.NumberFormat;

/**
 * Just a 2D point
 */
public class Point {

    // just a 2d point

    private double x, y;
    private static NumberFormat nf;

    public Point(double x, double y) {
	this.x = x;
	this.y = y;
    }

    public Point(Point p) {
	this.x = p.x;
	this.y = p.y;
    }

    public double getX() {
	return x;
    }

    public double getY() {
	return y;
    }

    public double dist(Point o) {
	return (o.x-x)*(o.x-x)+(o.y-y)*(o.y-y);
    }

    public String toString() {
	if (nf == null) {
	    nf = NumberFormat.getInstance();
	    nf.setMaximumFractionDigits(2);
	}
	return "(" + nf.format(x) + "," + nf.format(y) + ")";
    }

    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point op = (Point)(o);
        return (op.x == x && op.y == y);
    }

    public int hashCode() {
        // points in our app should be no bigger than 0->100 in x,y
        // hash is xxxxyyyy
        return ((int)(x*100))*10000 + (int)(y*100);
    }
}