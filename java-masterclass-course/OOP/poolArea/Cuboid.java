package poolArea;

/**
 * Cuboid
 */
public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double widthVal, double lengthVal, double heightVal) {
        super(widthVal, lengthVal);
        this.height = heightVal;

        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }
}