package midterm.y20212022.solution.exe02;

public interface Poly {
    public int coefficient(int i);

    public int[] coefficients();

    public int degree();

    public Poly derivative();

    public double evaluate(double x);

    public String type();
}
