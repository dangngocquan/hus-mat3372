package lab06.exercise2p1;

public class Point {
    // private variables
    private int x;
    private int y;

    // constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
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

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public String toString() {
        return String.format("Point: (%d,%d)", x, y);
    }
}
