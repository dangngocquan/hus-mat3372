package lastterm.y2023.solution.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
       return integrate(poly, lower, upper, 10000);
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double ans = 0;
        double delta  = (upper - lower) / numOfSubIntervals;
        double[] x = new double[numOfSubIntervals+1];
        for (int i = 0; i <= numOfSubIntervals; i++) {
            x[i] = lower + i * delta;
        }

        for (int i = 0; i <= numOfSubIntervals; i++) {
            if (i == 0 || i == numOfSubIntervals) {
                ans += poly.evaluate(x[i]);
                continue;
            }
            if (i % 2 == 0) {
                ans += 2 * poly.evaluate(x[i]);
            } else {
                ans += 4 * poly.evaluate(x[i]);
            }
        }
        ans *= delta / 3;
        return ans;
    }
}
