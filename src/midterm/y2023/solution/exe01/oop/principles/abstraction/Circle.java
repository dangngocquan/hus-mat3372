package midterm.y2023.solution.exe01.oop.principles.abstraction;

public class Circle extends Shape {
    // private instance variables
    private int radius;

    // constructors
    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    // getters and setters method
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[center = %s, radius = %s]", getCenter(), radius);
    }
}
