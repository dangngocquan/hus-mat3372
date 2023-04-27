package midterm.y20212022.solution.exe01;

public class Fraction extends Number implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    public Fraction(Fraction fraction) {
        this.numerator = fraction.getNumerator();
        this.denominator = fraction.getDenominator();
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction another) {
        Fraction fraction = new Fraction(
                numerator * another.getDenominator() + another.getNumerator() * denominator,
                denominator * another.getDenominator()
        );
        fraction.simplify();
        return fraction;
    }

    public Fraction add(int value) {
        return add(new Fraction(value));
    }

    @Override
    public int compareTo(Fraction o) {
        return numerator * o.getDenominator() - o.getNumerator() * denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public boolean equals(Fraction another) {
        return numerator * another.getDenominator() == another.getNumerator() * denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) (numerator / denominator);
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    @Override
    public String toString() {
        return String.format("Fraction[%d/%d]",
                    numerator, denominator);
    }

    public static void main(String[] args) {

    }
}
