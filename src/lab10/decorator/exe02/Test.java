package lab10.decorator.exe02;

public class Test {
    public static void main(String[] args) {
        IceCream iceCream01 = new VanillaIceCream();
        System.out.println(iceCream01.getDescription());    // Vanilla Ice Cream

        IceCream iceCream02 = new StrawberryIceCream();
        System.out.println(iceCream02.getDescription());    // Strawberry Ice Cream

        IceCream iceCream03 = new ChocolateIceCream();
        System.out.println(iceCream03.getDescription());    // Chocolate Ice Cream

        ToppingDecorator iceCream01Topping = new HoneyToppingDecorator(iceCream01);
        System.out.println(iceCream01Topping.getDescription()); // Vanilla Ice Cream with Honey topping

        ToppingDecorator iceCream02Topping = new NutsToppingDecorator(iceCream02);
        System.out.println(iceCream02Topping.getDescription()); // Strawberry Ice Cream with Nuts topping

        ToppingDecorator iceCream01DoubleTopping = new NutsToppingDecorator(iceCream01Topping);
        System.out.println(iceCream01DoubleTopping.getDescription());
        // Vanilla Ice Cream with Honey topping with Nuts topping
    }
}
