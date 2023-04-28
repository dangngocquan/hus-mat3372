package midterm.y20212022.solution.exe02;

public abstract class AbstractPoly implements Poly {
    protected int degree;

    public AbstractPoly() {

    }

    @Override
    public int degree() {
        return coefficients().length - 1;
    }

    int[] diffirentiate() {
        int[] coefficients = coefficients();
        if (coefficients.length == 1) {
            return new int[] {0};
        }

        int[] newCoefficients = new int[coefficients.length - 1];
        for (int i = 1; i < coefficients.length; i++) {
            newCoefficients[i-1] = coefficients[i] * i;
        }
        return newCoefficients;
    }

    @Override
    public boolean equals(Object o) {
        AbstractPoly otherPoly = (AbstractPoly) o;
        if (otherPoly.degree() != degree()) {
            return false;
        }
        int[] coefficients = coefficients();
        int[] otherCoefficients = otherPoly.coefficients();
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] != otherCoefficients[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double evaluate(double x) {
        int[] coefficients = coefficients();
        double res = 0.0;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            res = res * x + coefficients[i];
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Poly[");
        int[] coefficients = coefficients();
        for (int i = 0; i < coefficients.length; i++) {
            if (i == 0) {
                sb.append(coefficients[i]).append(" + ");
            } else if (i == 1) {
                sb.append(coefficients[i]).append("x + ");
            } else {
                sb.append(coefficients[i]).append(
                        String.format("x^%d + ", i)
                );
            }
        }
        if (sb.length() > 3) {
            sb.delete(sb.length() - 3, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }
}
