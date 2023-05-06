package midterm.y2023.solution.exe02.polynomial;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double x = lower;
        for (int i = 0; i < maxIterations; i++) {
            double x1 = x - polynomial.evaluate(x) / polynomial.derivative().evaluate(x);
            if (Math.abs(x1 - x) <= tolerance) {
                x = x1;
                break;
            }
            x = x1;
        }
        return x;
    }
}
