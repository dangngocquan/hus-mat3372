package oop.principles.abstraction;

public abstract class Shape {
    private int xCenter;
    private int yCenter;

    public Shape(int x, int y) {
        xCenter = x;
        yCenter = y;
    }

    public int getxCenter() {
        return xCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public abstract double area();
}
