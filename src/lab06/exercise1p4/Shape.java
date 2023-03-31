package lab06.exercise1p4;

public class Shape {
    // private variables
    private String color;
    private boolean filled;

    // constructors
    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Method
    public String toString() {
        return String.format("Shape[color = %s, filled = %s]", color, filled);
    }
}
