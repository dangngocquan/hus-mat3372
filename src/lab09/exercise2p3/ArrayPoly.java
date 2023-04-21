package lab09.exercise2p3;

public class ArrayPoly extends AbstractPoly {
    double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        super();
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] coefficients = super.derive();
        return new ListPoly(coefficients);
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }
}
