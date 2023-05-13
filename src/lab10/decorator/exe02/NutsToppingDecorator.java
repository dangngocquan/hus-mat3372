package lab10.decorator.exe02;

public class NutsToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        super();
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with " + this.addTopping();
    }

    @Override
    public String addTopping() {
        return "Nuts topping";
    }
}
