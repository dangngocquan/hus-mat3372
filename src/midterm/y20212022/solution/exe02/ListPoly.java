package midterm.y20212022.solution.exe02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    private List<Integer> coefficients;

    public ListPoly(int[] coefficients) {
        super();
        this.coefficients = new LinkedList<Integer>();
        for (int coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
        degree = degree();
    }


    @Override
    public int coefficient(int i) {
        if (i < 0 || i >= coefficients.size()) {
            return 0;
        }
        return coefficients.get(i);
    }

    @Override
    public int[] coefficients() {
        int[] coefficientsArr = new int[coefficients.size()];
        for (int i = 0; i < coefficientsArr.length; i++) {
            coefficientsArr[i] = coefficients.get(i);
        }
        return coefficientsArr;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(diffirentiate());
    }

    public ListPoly minus(ListPoly another) {
        int degree = Math.max(degree(), another.degree());
        int[] coefficients1 = coefficients();
        int[] coefficients2 = another.coefficients();
        int[] coefficients = new int[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients[i] += (i < coefficients1.length)? coefficients1[i] : 0;
            coefficients[i] -= (i < coefficients2.length)? coefficients2[i] : 0;
        }
        ListPoly poly = new ListPoly(coefficients);
        poly.reduce();
        return poly;
    }

    public ListPoly plus(ListPoly another) {
        int degree = Math.max(degree(), another.degree());
        int[] coefficients1 = coefficients();
        int[] coefficients2 = another.coefficients();
        int[] coefficients = new int[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients[i] += (i < coefficients1.length)? coefficients1[i] : 0;
            coefficients[i] += (i < coefficients2.length)? coefficients2[i] : 0;
        }
        ListPoly poly = new ListPoly(coefficients);
        poly.reduce();
        return poly;
    }

    private void reduce() {
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            if (coefficients.get(i) == 0) {
                degree--;
            } else {
                break;
            }
        }
        coefficients = coefficients.subList(0, degree + 1);
    }

    public ListPoly times(ListPoly another) {
        int degree = degree() + another.degree();
        int[] coefficients1 = coefficients();
        int[] coefficients2 = another.coefficients();
        int[] coefficients = new int[degree + 1];
        for (int i1 = 0; i1 < coefficients1.length; i1++) {
            for (int i2 = 0; i2 < coefficients2.length; i2++) {
                coefficients[i1 + i2] += coefficients1[i1] * coefficients2[i2];
            }
        }
        ListPoly poly = new ListPoly(coefficients);
        poly.reduce();
        return poly;
    }

    public String type() {
        return "List Poly";
    }
}
