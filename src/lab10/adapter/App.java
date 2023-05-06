package lab10.adapter;

public class App {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(6);
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(6);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(roundHole.fits(squarePegAdapter));

        squarePeg.setWidth(12);
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
