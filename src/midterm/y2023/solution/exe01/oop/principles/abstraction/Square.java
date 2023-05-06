package oop.principles.abstraction;

public class Square extends Shape implements Movable {
    private double side;

    public Square(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side *side;
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
        return String.format("Square[x=%s, y=%s, side=%s]",
                getxCenter(), getyCenter(), side);
    }
}
