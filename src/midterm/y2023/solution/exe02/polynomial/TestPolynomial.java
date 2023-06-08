package midterm.y2023.solution.exe02.polynomial;

public class TestPolynomial {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        System.out.println("Test ArrayPolynomial:\n");
        testArrayPolynomial();

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        System.out.println("Test ListPolynomial:\n");
        testListPolynomial();

        System.out.println("\n-------------------------------------------------------------------------------------\n");

        System.out.println("Test RootSolver:\n");
        testRootSolver();
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

        poly1.remove(4);
        System.out.printf("%-42s %s\n", "poly1.remove(index = 4):", poly1);

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

        poly1.remove(4);
        System.out.printf("%-42s %s\n", "poly1.remove(index = 4):", poly1);

        poly1.set(0, 2);
        System.out.printf("%-42s %s\n", "poly1.set(coefficient = 0, index = 2):", poly1);

        ListPolynomial poly2 = new ListPolynomial(new double[] {2, -3, 0, 1});
        System.out.printf("\n%-42s %s\n", "poly2:", poly2);

        System.out.printf("%-42s %s\n", "poly1 + poly2:", poly1.plus(poly2));
        System.out.printf("%-42s %s\n", "poly1 - poly2:", poly1.minus(poly2));
        System.out.printf("%-42s %s\n", "poly1 * poly2:", poly1.multiply(poly2));
        System.out.printf("%-42s %s\n", "poly2.evaluate(x = 2):", poly2.evaluate(2));
    }

    public static void testRootSolver() {
        /*
         TODO

         - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
         - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
         */

        Polynomial poly = new ArrayPolynomial(new double[] {9, -10, 1});
        System.out.printf("%-42s %s\n", "poly:", poly);

        PolynomialRootFinding polyRootFinding = new PolynomialRootFinding(poly);
        double tolerance = 0.001;
        int maxIterations = 1000;
        double lower = 0;
        double upper = 5;
        System.out.printf("tolerance = %s\nmaxIterations = %d\nlower = %s\nupper = %s\n",
                tolerance, maxIterations, lower, upper);

        polyRootFinding.setRootSolver(new BisectionSolver(tolerance, maxIterations));
        System.out.printf("%-42s x = %s\n",
                "Using Bisection Solver:",
                polyRootFinding.solve(lower, upper)
        );

        polyRootFinding.setRootSolver(new NewtonRaphsonSolver(tolerance, maxIterations));
        System.out.printf("%-42s x = %s\n",
                "Using Newton-Raphson Solver:",
                polyRootFinding.solve(lower, upper)
        );

        polyRootFinding.setRootSolver(new SecantSolver(tolerance, maxIterations));
        System.out.printf("%-42s x = %s\n",
                "Using Secant Solver:",
                polyRootFinding.solve(lower, upper)
        );


    }
}
