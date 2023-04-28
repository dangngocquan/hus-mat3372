package midterm.y20212022.solution.exe02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayPoly extends AbstractPoly {
    private int[] coefficients;

    public ArrayPoly(int[] coefficients) {
        super();
        this.coefficients = coefficients;
        degree = degree();
    }


    @Override
    public int coefficient(int i) {
        if (i < 0 || i >= coefficients.length) {
            return 0;
        }
        return coefficients[i];
    }

    @Override
    public int[] coefficients() {
        return coefficients;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(diffirentiate());
    }

    public ArrayPoly minus(ArrayPoly another) {
        int degree = Math.max(degree(), another.degree());
        int[] coefficients1 = coefficients();
        int[] coefficients2 = another.coefficients();
        int[] coefficients = new int[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients[i] += (i < coefficients1.length)? coefficients1[i] : 0;
            coefficients[i] -= (i < coefficients2.length)? coefficients2[i] : 0;
        }
        ArrayPoly poly = new ArrayPoly(coefficients);
        poly.reduce();
        return poly;
    }

    public ArrayPoly plus(ArrayPoly another) {
        int degree = Math.max(degree(), another.degree());
        int[] coefficients1 = coefficients();
        int[] coefficients2 = another.coefficients();
        int[] coefficients = new int[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients[i] += (i < coefficients1.length)? coefficients1[i] : 0;
            coefficients[i] += (i < coefficients2.length)? coefficients2[i] : 0;
        }
        ArrayPoly poly = new ArrayPoly(coefficients);
        poly.reduce();
        return poly;
    }

    private void reduce() {
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] == 0) {
                degree--;
            } else {
                break;
            }
        }
        coefficients = Arrays.copyOf(coefficients, degree + 1);
    }

    public ArrayPoly times(ArrayPoly another) {
        int degree = degree() + another.degree();
        int[] coefficients1 = coefficients();
        int[] coefficients2 = another.coefficients();
        int[] coefficients = new int[degree + 1];
        for (int i1 = 0; i1 < coefficients1.length; i1++) {
            for (int i2 = 0; i2 < coefficients2.length; i2++) {
                coefficients[i1 + i2] += coefficients1[i1] * coefficients2[i2];
            }
        }
        ArrayPoly poly = new ArrayPoly(coefficients);
        poly.reduce();
        return poly;
    }

    public String type() {
        return "Array Poly";
    }
}
