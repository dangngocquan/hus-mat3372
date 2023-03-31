package lab06.exercise2p2;

public class Cylinder {
    // private instance variables
    private Circle base;
    private double height;

    // constructors
    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    // Method
    public double getVolume() {
        return height * base.getArea();
    }

    public String toString() {
        return String.format("Cylinder[base = %s, height = %s]",
                base.toString(), height);
    }
}
