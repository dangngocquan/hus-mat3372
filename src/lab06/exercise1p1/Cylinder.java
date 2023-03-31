package lab06.exercise1p1;

public class Cylinder extends Circle {
    // private instance variables
    private double height;

    // constructors
    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getters and Setters

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method
    public double getVolume() {
        return height * getArea();
    }

    public String toString() {
        return String.format("Cylinder: subclass of %s height = %s",
                super.toString(), height);
    }
}
