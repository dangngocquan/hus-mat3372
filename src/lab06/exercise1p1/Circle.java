package lab06.exercise1p1;

public class Circle {
    // private instance variables
    private double radius;
    private String color;

    // constructors
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
        this.color = color  ;
    }

    // Getter and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return String.format("Circle[radius = %s, color = %s]", radius, color);
    }
}
