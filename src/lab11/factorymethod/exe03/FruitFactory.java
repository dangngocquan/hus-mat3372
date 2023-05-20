package lab11.factorymethod.exe03;

public class FruitFactory {
    public Fruit produceFruit(String type) {
        switch (type) {
            case "APPLE":
                return new Apple();
            case "BANANA":
                return new Banana();
            case "ORANGE":
                return new Orange();
            default:
                return null;
        }
    }
}
