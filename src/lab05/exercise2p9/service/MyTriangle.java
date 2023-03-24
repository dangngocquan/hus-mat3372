package lab05.exercise2p9.service;

public class MyTriangle {
    // private instance variables
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // constructors
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return String.format("MyTriangle[v1 = %s, v2 = %s, v3 = %s]",
                v1, v2, v3);
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double length12 = v1.distance(v2);
        double length23 = v2.distance(v3);
        double length31 = v3.distance(v1);
        if (Double.compare(length12, length23) == 0
            && Double.compare(length23, length31) == 0) {
            return "Equilateral";
        }

        if (Double.compare(length12, length23) == 0
                || Double.compare(length23, length31) == 0
                || Double.compare(length31, length12) == 0) {
            return "Isosceles";
        }
        return "Scalene";
    }
}
