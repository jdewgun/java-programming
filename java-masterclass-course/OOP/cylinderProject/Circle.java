package cylinderProject;

/**
 * Circle
 */
public class Circle {

    private double radius;

    public Circle(double radiusVal) {
        this.radius = radiusVal;

        if (this.radius < 0) {
            this.radius = 0;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}