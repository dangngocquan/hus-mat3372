package lab06.exercise1p4;

public class Square extends Rectangle {
    // constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getters and Setters
    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
