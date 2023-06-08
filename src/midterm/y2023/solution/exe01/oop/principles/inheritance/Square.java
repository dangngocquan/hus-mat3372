package midterm.y2023.solution.exe01.oop.principles.inheritance;

public class Square extends Rectangle {
    // constructor

    public Square(double side) {
        super(side, side);
    }

    // method: get side of square
    public double getSide() {
        return getLength();
    }

    // method: set side of square
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // width and length of square should be same value
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
