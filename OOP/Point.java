/**
 * Point
 */
public class Point {

    private int x;
    private int y;

    public Point() {
        // Empty Constructor
    }

    public Point(int valX, int valY) {
        this.x = valX;
        this.y = valY;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int valX) {
        this.x = valX;
    }

    public void setY(int valY) {
        this.y = valY;
    }

    public double distance(Point pointVal) {
        double distanceVal;

        distanceVal = Math
                .sqrt((this.y - pointVal.y) * (this.y - pointVal.y) + (this.x - pointVal.x) * (this.x - pointVal.x));

        return distanceVal;
    }

    public double distance(int pointValX, int pointValY) {
        Point pointVal = new Point(pointValX, pointValY);

        double distanceVal = distance(pointVal);

        return distanceVal;
    }

    public double distance() {
        Point pointVal = new Point(0, 0);

        double distanceVal = distance(pointVal);

        return distanceVal;
    }

}