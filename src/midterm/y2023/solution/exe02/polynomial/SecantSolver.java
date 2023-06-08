package midterm.y2023.solution.exe02.polynomial;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double x0 = lower;
        double x1 = upper;
        double x2 = x1 - polynomial.evaluate(x1) * (
                        (x1 - x0) / (polynomial.evaluate(x1) - polynomial.evaluate(x0))
                        );
        for (int i = 0; i < maxIterations; i++) {
            double x3 = x2 - polynomial.evaluate(x2) * (
                    (x2 - x1) / (polynomial.evaluate(x2) - polynomial.evaluate(x1))
                    );
            if (Math.abs(x3 - x2) <= tolerance) {
                x2 = x3;
                break;
            }
            x0 = x1;
            x1 = x2;
            x2 = x3;
        }
        return x2;
    }
}
