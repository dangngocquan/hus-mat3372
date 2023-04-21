package lab09.exercise2p3;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {

    }

    double[] derive() {
        double[] coefficients = coefficients();
        double[] coefficientsDerive = new double[coefficients.length];
        for (int degree = 1; degree < coefficients.length; degree++) {
            if (degree == coefficients.length - 1) {
                coefficientsDerive[degree] = 0;
            } else {
                coefficientsDerive[degree-1] = degree * coefficients[degree];
            }
        }
        return coefficientsDerive;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        double[] thisCoefficients = coefficients();
        double[] thatCoefficients = ((AbstractPoly) object).coefficients();

        if (thisCoefficients.length != thatCoefficients.length) {
            return false;
        }

        for (int degree = 0; degree < thisCoefficients.length; degree++) {
            if (thisCoefficients[degree] != thatCoefficients[degree]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        double[] coefficients = coefficients();
        StringBuilder sb = new StringBuilder();
        for (int degree = 0; degree < coefficients.length; degree++) {
            double coefficient = coefficients[degree];
            if (degree == 0) {
                sb.append(coefficient).append(" + ");
            } else if (degree == 1) {
                sb.append(coefficient).append(" * x + ");
            } else {
                sb.append(coefficient).append(String.format(" * x^%d + ", degree));
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 3, sb.length());
        }
        return sb.toString();
    }
}
