package lastterm.y2023.solution.matrix;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        int size = (int) (Math.random() * 5) + 5;
        SquareMatrix m1 = new SquareMatrix(size);
        SquareMatrix m2 = new SquareMatrix(size);

        System.out.println("SquareMatrix m1");
        System.out.println(m1);
        System.out.println();

        System.out.println("SquareMatrix m2");
        System.out.println(m2);
        System.out.println();

        System.out.println("m1.transpose()");
        System.out.println(m1.transpose());
        System.out.println();

        System.out.println("m2.transpose()");
        System.out.println(m2.transpose());
        System.out.println();

        System.out.println("m1.principalDiagonal()");
        System.out.println(arrayToString(m1.principalDiagonal()));
        System.out.println();

        System.out.println("m2.principalDiagonal()");
        System.out.println(arrayToString(m2.principalDiagonal()));
        System.out.println();

        System.out.println("m1.secondaryDiagonal()");
        System.out.println(arrayToString(m1.secondaryDiagonal()));
        System.out.println();

        System.out.println("m2.secondaryDiagonal()");
        System.out.println(arrayToString(m2.secondaryDiagonal()));
        System.out.println();

        System.out.println("m1.add(m2)");
        System.out.println(m1.add(m2));
        System.out.println();

        System.out.println("m1.minus(m2)");
        System.out.println(m1.minus(m2));
        System.out.println();

        System.out.println("m1.multiply(m2)");
        System.out.println(m1.multiply(m2));
        System.out.println();

        System.out.println("m1.primes()");
        System.out.println(arrayToString(m1.primes()));
        System.out.println();

        System.out.println("m2.primes()");
        System.out.println(arrayToString(m2.primes()));
        System.out.println();
    }

    public static String arrayToString(int[] a) {
        StringBuilder s = new StringBuilder("[");
        for (int e : a) {
            s.append(e).append(" ");
        }
        if (s.length() > 1) {
            s.delete(s.length()-1, s.length());
        }
        s.append("]");
        return s.toString();
    }
}
