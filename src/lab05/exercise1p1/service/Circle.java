package lab05.exercise1p1.service;

public class Circle {
    // private instance variable
    private double radius;
    private String color;

    // Constructors
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
            return String.format("Circle[radius = %s, color = %s]",
                    this.radius, this.color);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
