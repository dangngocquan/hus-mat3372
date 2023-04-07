package lab07.exercise1p2;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    // constructors
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
