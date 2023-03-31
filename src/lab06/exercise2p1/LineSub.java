package lab06.exercise2p1;

public class LineSub extends Point {
    // private variables
    private Point end;

    // constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    // Getters and Setters
    public Point getBegin() {
        Point begin = new Point(super.getX(), super.getY());
        return begin;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    // Methods
    public double getLength() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return String.format("LineSub[begin = %s, end = %s]", super.toString(), end);
    }

}
