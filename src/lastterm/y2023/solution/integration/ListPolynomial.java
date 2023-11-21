package lastterm.y2023.solution.integration;

import java.util.LinkedList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        coefficients = new LinkedList<Double>();
    }

    public ListPolynomial(double[] coefficients) {
        this.coefficients = new LinkedList<Double>();
        for (double coefficient : coefficients) {
            append(coefficient);
        }
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] coefficients0 = new double[coefficients.size()];
        for (int i = 0; i < coefficients0.length; i++) {
            coefficients0[i] = coefficients.get(i);
        }
        return coefficients0;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double res = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            res = res * x + coefficient(i);
        }
        return res;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        return new ListPolynomial(differentiate());
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = Math.max(degree1, degree2);
        double[] coefficients0 = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients0[i] += (i <= degree1)? coefficient(i) : 0;
            coefficients0[i] += (i <= degree2)? another.coefficient(i) : 0;
        }
        ListPolynomial listPolynomial = new ListPolynomial(coefficients0);
        listPolynomial.reduce();
        return listPolynomial;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = Math.max(degree1, degree2);
        double[] coefficients0 = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients0[i] += (i <= degree1)? coefficient(i) : 0;
            coefficients0[i] -= (i <= degree2)? another.coefficient(i) : 0;
        }
        ListPolynomial listPolynomial = new ListPolynomial(coefficients0);
        listPolynomial.reduce();
        return listPolynomial;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = degree1 + degree2;
        double[] coefficients0 = new double[degree + 1];
        for (int i1 = 0; i1 <= degree1; i1++) {
            for (int i2 = 0; i2 <= degree2; i2++) {
                coefficients0[i1 + i2] += coefficient(i1) * another.coefficient(i2);
            }
        }
        ListPolynomial listPolynomial = new ListPolynomial(coefficients0);
        listPolynomial.reduce();
        return listPolynomial;
    }

    private void reduce() {
        int currentSize = coefficients.size();
        for (int i = currentSize - 1; i >= 0; i--) {
            if (coefficient(i) == 0) {
                currentSize--;
            } else {
                break;
            }
        }
        coefficients = coefficients.subList(0, currentSize);
    }
}
