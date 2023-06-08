package midterm.y2023.solution.exe01.oop.principles.abstraction;

public class Point {
    // private instance variables
    private int x;
    private int y;

    // constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters method
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
