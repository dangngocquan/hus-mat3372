package lab05.exercise1p3.service;

public class Rectangle {
    // Private instance variables
    private float length;
    private float width;

    // Constructors
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter
    public float getLength() {
        return this.length;
    }

    public float getWidth(){
        return this.width;
    }

    // Setter
    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("Rectangle[length = %s, width = %s]",
                length, width);
    }
}
