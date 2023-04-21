package lab09.exercise2p3;

import java.util.LinkedList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coefficients) {
        super();
        this.coefficients = new LinkedList<>();
        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] coefficients = super.derive();
        return new ListPoly(coefficients);
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        int size = this.coefficients.size();
        double[] coefficientsArr = new double[size];
        for (int index = 0; index < size; index++) {
            coefficientsArr[index] = coefficients.get(index);
        }
        return coefficientsArr;
    }
}
