package midterm.y2023.solution.exe02.polynomial;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double a = lower;
        double b = upper;
        double c = (a + b) / 2;
        for (int i = 0; i < maxIterations; i++) {
            double fa = polynomial.evaluate(a);
            double fb = polynomial.evaluate(b);
            c = (a + b) / 2;
            double fc = polynomial.evaluate(c);
            if (Double.compare(fc, 0) == 0 || (b - a) / 2 < tolerance) {
                break;
            }
            if (fa * fc <= 0) {
                b = c;
            } else {
                a = c;
            }
        }
        return c;
    }
}
