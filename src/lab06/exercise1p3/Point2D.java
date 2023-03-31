package lab06.exercise1p3;

public class Point2D {
    // private variables
    private float x;
    private float y;

    // constructors
    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%s, %s)", x, y);
    }
}
