package lab09.exercise2p3;

public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[] {1, 3, 4, 8});
        Poly lp = new ListPoly(new double[] {1, 3, 4, 8});

        System.out.println("ap = " + ap);
        System.out.println("lp = " + lp);

        if (ap.equals(lp) && lp.equals(ap)) {
            System.out.println("ap == lp");
        } else {
            System.out.println("ap != lp");
        }

    }
}
