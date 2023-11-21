package lastterm.y2023.solution.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        double[] coefficients = coefficients();
        for (int i = 0; i < coefficients.length; i++) {
            if (Double.compare(coefficients[i], 0) != 0) {
                if (coefficients[i] > 0) {
                    if (i == 0) {
                        sb.append(coefficients[i]).append(" + ");
                    } else if (i == 1) {
                        if (Double.compare(coefficients[i], 1.0) != 0) {
                            sb.append(coefficients[i]);
                        }
                        sb.append("x + ");
                    } else {
                        if (Double.compare(coefficients[i], 1.0) != 0) {
                            sb.append(coefficients[i]);
                        }
                        sb.append(String.format("x^%d + ", i));
                    }
                } else {
                    if (i == 0) {
                        sb.append(String.format("(%s)", coefficients[i])).append(" + ");
                    } else if (i == 1) {
                        sb.append(String.format("(%s)", coefficients[i])).append("x + ");
                    } else {
                        sb.append(String.format("(%s)", coefficients[i]))
                                .append(String.format("x^%d + ", i));
                    }
                }
            }
        }
        if (sb.length() > 3) {
            sb.delete(sb.length()-3, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coefficients = coefficients();
        if (coefficients.length == 1) {
            return new double[] {0};
        }
        double[] coefficients1 = new double[coefficients.length-1];
        for (int i = 1; i < coefficients.length; i++) {
            coefficients1[i-1] = coefficients[i] * i;
        }
        return coefficients1;
    }
}
