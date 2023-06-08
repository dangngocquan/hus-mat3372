package midterm.y2023.solution.exe01.oop.principles.abstraction;

public class Square extends Shape {
    // private instance variables
    private int side;

    // constructors
    public Square(Point center, int side) {
        super(center);
        this.side = side;
    }

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    // getters and setters method
    public int getSide() {
        return side;
    }

    public void setSide(int radius) {
        this.side = radius;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return String.format("Square[center = %s, side = %s]", getCenter(), side);
    }
}
