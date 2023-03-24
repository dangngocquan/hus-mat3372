package lab05.exercise1p2.service;

public class Circle {
    // private instance variable
    private double radius;

    // Constructors
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("Circle[radius = %s]", this.radius);
    }
}
