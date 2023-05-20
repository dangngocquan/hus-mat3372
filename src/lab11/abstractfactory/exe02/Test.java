package lab11.abstractfactory.exe02;

public class Test {
    public static void main(String[] args) {
        IFactory factory1 = new PlasticFactory();
        ICup cup1 = factory1.createCup();
        System.out.println(cup1.getType()); // Plastic Cup
        IBowl bowl1 = factory1.createBowl();
        System.out.println(bowl1.getType());    // Plastic Bowl

        IFactory factory2 = new WoodenFactory();
        ICup cup2 = factory2.createCup();
        System.out.println(cup2.getType()); // Wooden Cup
        IBowl bowl2 = factory2.createBowl();
        System.out.println(bowl2.getType());    // Wooden Bowl
    }
}
