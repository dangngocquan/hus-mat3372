package oop.principles.abstraction;

public class Circle extends Shape implements Movable {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void moveUp(int value) {
        setyCenter(getyCenter() + value);
    }

    @Override
    public void moveRight(int value) {
        setxCenter(getxCenter() + value);
    }

    @Override
    public void moveLeft(int value) {
        setyCenter(getyCenter() - value);
    }

    @Override
    public void moveDown(int value) {
        setxCenter(getxCenter() - value);
    }

    @Override
    public String toString() {
        return String.format("Circle[x=%s, y=%s, radius=%s]",
                getxCenter(), getyCenter(), radius);
    }
}
