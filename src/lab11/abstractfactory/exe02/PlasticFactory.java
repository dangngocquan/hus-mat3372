package lab11.abstractfactory.exe02;

public class PlasticFactory implements IFactory {
    @Override
    public ICup createCup() {
        return new PlasticCup();
    }

    @Override
    public IBowl createBowl() {
        return new PlasticBowl();
    }
}
