package lab10.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg adapter;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(0);
        this.adapter = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int) Math.ceil(Math.sqrt(2) / 2 * adapter.getWidth());
    }
}
