package poolArea;

/**
 * Rectangle
 */
public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double widthVal, double lengthVal) {
        this.width = widthVal;
        this.length = lengthVal;

        if (this.width < 0) {
            this.width = 0;
        }

        if (this.length < 0) {
            this.length = 0;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}