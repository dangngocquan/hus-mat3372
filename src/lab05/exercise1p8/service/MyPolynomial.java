package lab05.exercise1p8.service;

public class MyPolynomial {
    // private instance variables
    private double[] coeffs;

    // constructors
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return this.coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int index = coeffs.length-1; index >= 0; index--) {
            if (index == 0) {
                str.append(coeffs[index]);
                continue;
            }
            if (index == 1) {
                str.append(coeffs[index]).append("x").append(" + ");
                continue;
            }
            str.append(coeffs[index]).append("x^").append(index).append(" + ");
        }
        return str.toString();
    }

    public double evaluate(double x) {
        double result = 0.0;
        for (int index = coeffs.length-1; index >= 0; index--) {
            result = result * x + coeffs[index];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int degree = Math.max(this.getDegree(), right.getDegree());
        double[] coeffs1 = new double[degree+1];
        for (int index = 0; index <= degree; index++) {
            coeffs1[index] += (index <= this.getDegree())? this.coeffs[index] : 0.0;
            coeffs1[index] += (index <= right.getDegree())? right.getCoeffs()[index] : 0.0;
        }
        return new MyPolynomial(coeffs1);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int degree1 = this.getDegree();
        int degree2 = right.getDegree();
        double[] coeffs1 = this.getCoeffs();
        double[] coeffs2 = right.getCoeffs();
        double[] coeffs0 = new double[degree1 + degree2 + 1];
        for (int index1 = 0; index1 <= degree1; index1++) {
            for (int index2 = 0; index2 <= degree2; index2++) {
                coeffs0[index1+index2] += coeffs1[index1] * coeffs2[index2];
            }
        }
        return new MyPolynomial(coeffs0);
    }
}
