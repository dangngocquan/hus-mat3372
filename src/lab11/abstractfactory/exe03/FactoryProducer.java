package lab11.abstractfactory.exe03;

public class FactoryProducer {
    public AbstractFactory getFactory(String typeFactory) {
        if (typeFactory.equalsIgnoreCase("SHAPE_FACTORY")) {
            return new ShapeFactory();
        } else if (typeFactory.equalsIgnoreCase("ROUNDED_SHAPE_FACTORY")) {
            return new RoundedShapeFactory();
        }
        return null;
    }
}
