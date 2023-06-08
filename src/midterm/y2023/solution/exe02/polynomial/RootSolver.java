package midterm.y2023.solution.exe02.polynomial;

public interface RootSolver {
    /**
     * Tìm nghiệm của đa thức trong khoảng [lower, upper]
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    double solve(Polynomial polynomial, double lower, double upper);
}
