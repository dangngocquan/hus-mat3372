package lab05.exercise2p10.service;

import lab05.exercise1p3.service.Rectangle;

public class MyRectangle {
    // private instance variables
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructor
    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public String toString() {
        return String.format("MyRectangle[topLeft = %s, bottomRight = %s]", topLeft, bottomRight);
    }

    public double getWidth() {
        return topLeft.distance(bottomRight.getX(), topLeft.getY());
    }

    public double getHeight() {
        return topLeft.distance(topLeft.getX(), bottomRight.getY());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
