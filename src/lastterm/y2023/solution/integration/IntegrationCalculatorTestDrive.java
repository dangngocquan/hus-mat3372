package lastterm.y2023.solution.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        System.out.println("Test ArrayPolynomial:\n");
        testArrayPolynomial();

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        System.out.println("Test ListPolynomial:\n");
        testListPolynomial();

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        System.out.println("Test IntegrationCalculator:\n");
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        ArrayPolynomial poly1 = new ArrayPolynomial(new double[] {1, 4, 1, 0, -2});
        System.out.printf("%-42s %s\n", "poly1:", poly1);

        poly1.append(5);
        System.out.printf("%-42s %s\n", "poly1.append(coefficient = 5):", poly1);

        poly1.insert(3, 1);
        System.out.printf("%-42s %s\n", "poly1.insert(coefficient = 3, index = 1):", poly1);

        poly1.set(0, 2);
        System.out.printf("%-42s %s\n", "poly1.set(coefficient = 0, index = 2):", poly1);

        ArrayPolynomial poly2 = new ArrayPolynomial(new double[] {2, -3, 0, 1});
        System.out.printf("\n%-42s %s\n", "poly2:", poly2);

        System.out.printf("%-42s %s\n", "poly1 + poly2:", poly1.plus(poly2));
        System.out.printf("%-42s %s\n", "poly1 - poly2:", poly1.minus(poly2));
        System.out.printf("%-42s %s\n", "poly1 * poly2:", poly1.multiply(poly2));
        System.out.printf("%-42s %s\n", "poly2.evaluate(x = 2):", poly2.evaluate(2));
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        ListPolynomial poly1 = new ListPolynomial(new double[] {1, 4, 1, 0, -2});
        System.out.printf("%-42s %s\n", "poly1:", poly1);

        poly1.append(5);
        System.out.printf("%-42s %s\n", "poly1.append(coefficient = 5):", poly1);

        poly1.insert(3, 1);
        System.out.printf("%-42s %s\n", "poly1.insert(coefficient = 3, index = 1):", poly1);

        poly1.set(0, 2);
        System.out.printf("%-42s %s\n", "poly1.set(coefficient = 0, index = 2):", poly1);

        ListPolynomial poly2 = new ListPolynomial(new double[] {2, -3, 0, 1});
        System.out.printf("\n%-42s %s\n", "poly2:", poly2);

        System.out.printf("%-42s %s\n", "poly1 + poly2:", poly1.plus(poly2));
        System.out.printf("%-42s %s\n", "poly1 - poly2:", poly1.minus(poly2));
        System.out.printf("%-42s %s\n", "poly1 * poly2:", poly1.multiply(poly2));
        System.out.printf("%-42s %s\n", "poly2.evaluate(x = 2):", poly2.evaluate(2));
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */

        Polynomial poly = new ArrayPolynomial(new double[] {9, -10, 1});
        System.out.printf("%-42s %s\n", "poly:", poly);

        IntegrationCalculator integrationCalculator = new IntegrationCalculator(poly);
        double precision = 0.001;
        int maxIterations = 1000;
        double lower = 0;
        double upper = 5;
        System.out.printf("precision = %s\nmaxIterations = %d\nlower = %s\nupper = %s\n",
                precision, maxIterations, lower, upper);

        integrationCalculator.setIntegrator(new MidpointRule(precision, maxIterations));
        System.out.printf("%-42s value = %s\n",
                "Using Midpoint Rule:",
                integrationCalculator.integrate(lower, upper)
        );

        integrationCalculator.setIntegrator(new TrapezoidRule(precision, maxIterations));
        System.out.printf("%-42s value = %s\n",
                "Using Trapezoid Rule Solver:",
                integrationCalculator.integrate(lower, upper)
        );

        integrationCalculator.setIntegrator(new SimpsonRule(precision, maxIterations));
        System.out.printf("%-42s value = %s\n",
                "Using SimpsonRule Solver:",
                integrationCalculator.integrate(lower, upper)
        );
    }
}
