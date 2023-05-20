package lab11.factorymethod.exe03;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        factory.produceFruit("APPLE");  // Produced Apple
        factory.produceFruit("BANANA"); // Produced Banana
        factory.produceFruit("ORANGE"); // Produced Orange
    }
}
