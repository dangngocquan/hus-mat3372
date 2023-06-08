package midterm.y2023.solution.exe01.oop.principles.abstraction;

public abstract class Shape implements Movable {
    // private instance variable
    private Point center;

    // constructors
    public Shape(Point center) {
        this.center = center;
    }

    public Shape(int x, int y) {
        this.center = new Point(x, y);
    }

    // getter and setters
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    // abstract methods
    public abstract double area();

    public abstract double perimeter();

    @Override
    public void moveUp(int value) {
        getCenter().setY(getCenter().getY() + value);
    }

    @Override
    public void moveRight(int value) {
        getCenter().setX(getCenter().getX() + value);
    }

    @Override
    public void moveLeft(int value) {
        getCenter().setX(getCenter().getX() - value);
    }

    @Override
    public void moveDown(int value) {
        getCenter().setY(getCenter().getY() - value);
    }
}
