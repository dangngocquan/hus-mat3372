package lab11.abstractfactory.exe03;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory factory1 = factoryProducer.getFactory("SHAPE_FACTORY");
        Shape shape1 = factory1.getShape("RECTANGLE");
        shape1.draw();  // Drawn Rectangle
        Shape shape2 = factory1.getShape("SQUARE");
        shape2.draw();  // Drawn Square

        AbstractFactory factory2 = factoryProducer.getFactory("ROUNDED_SHAPE_FACTORY");
        Shape shape3 = factory2.getShape("RECTANGLE");
        shape3.draw();  // Drawn Rounded Rectangle
        Shape shape4 = factory2.getShape("SQUARE");
        shape4.draw();  // Drawn Rounded Square
    }
}
