package midterm.y2023.solution.exe02.polynomial;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        coefficients = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public ArrayPolynomial(double[] coefficients) {
        this.coefficients = new double[DEFAULT_CAPACITY];
        size = 0;
        for (double coefiicient : coefficients) {
            append(coefiicient);
        }
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        double[] coefficients0 = new double[size];
        for (int i = 0; i < size; i++) {
            coefficients0[i] = coefficient(i);
        }
        return coefficients0;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        if (size == coefficients.length) {
            enlarge();
        }
        coefficients[size] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == coefficients.length) {
            enlarge();
        }
        for (int i = size - 1; i >= index; i--) {
            coefficients[i+1] = coefficients[i];
        }
        coefficients[index] = coefficient;
        size++;
        return this;
    }

    public ArrayPolynomial remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            coefficients[i] = coefficients[i+1];
        }
        size--;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return coefficients().length - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double res = 0.0;
        for (int i = size - 1; i >= 0; i--) {
            res = res * x + coefficient(i);
        }
        return res;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        return new ArrayPolynomial(differentiate());
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = Math.max(degree1, degree2);
        double[] coefficients0 = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients0[i] += (i <= degree1)? coefficient(i) : 0;
            coefficients0[i] += (i <= degree2)? another.coefficient(i) : 0;
        }
        ArrayPolynomial arrayPolynomial = new ArrayPolynomial(coefficients0);
        arrayPolynomial.reduce();
        return arrayPolynomial;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = Math.max(degree1, degree2);
        double[] coefficients0 = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients0[i] += (i <= degree1)? coefficient(i) : 0;
            coefficients0[i] -= (i <= degree2)? another.coefficient(i) : 0;
        }
        ArrayPolynomial arrayPolynomial = new ArrayPolynomial(coefficients0);
        arrayPolynomial.reduce();
        return arrayPolynomial;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = degree1 + degree2;
        double[] coefficients0 = new double[degree + 1];
        for (int i1 = 0; i1 <= degree1; i1++) {
            for (int i2 = 0; i2 <= degree2; i2++) {
                coefficients0[i1 + i2] += coefficient(i1) * another.coefficient(i2);
            }
        }
        ArrayPolynomial arrayPolynomial = new ArrayPolynomial(coefficients0);
        arrayPolynomial.reduce();
        return arrayPolynomial;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] coefficients0 = new double[size*2];
        for (int i = 0; i < size; i++) {
            coefficients0[i] = coefficient(i);
        }
        coefficients = coefficients0;
    }

    private void reduce() {
        int currentSize = size;
        for (int i = currentSize - 1; i >= 0; i--) {
            if (coefficient(i) == 0) {
                size--;
            } else {
                break;
            }
        }
    }
}
