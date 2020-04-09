/**
 * Wall
 */
public class Wall {

    private double width;
    private double height;

    public Wall() {
        // Empty Constructor
    }

    public Wall(double widthValue, double heightValue) {
        this.width = widthValue;
        this.height = heightValue;

        if (this.width < 0) {
            this.width = 0;
        }

        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double setValue) {
        this.width = setValue;

        if (this.width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double setValue) {
        this.height = setValue;

        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }

}