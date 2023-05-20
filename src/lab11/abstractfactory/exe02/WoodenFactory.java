package lab11.abstractfactory.exe02;

public class WoodenFactory implements IFactory {
    @Override
    public ICup createCup() {
        return new WoodenCup();
    }

    @Override
    public IBowl createBowl() {
        return new WoodenBowl();
    }
}
