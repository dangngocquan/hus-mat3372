package lab11.factorymethod.exe02;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println(
                shapeFactory.createShape("TRIANGLE").getType());    // Triangle
        System.out.println(
                shapeFactory.createShape("CIRCLE").getType());  // Circle
        System.out.println(
                shapeFactory.createShape("RECTANGLE").getType());   // Rectangle
        System.out.println(
                shapeFactory.createShape("SQUARE").getType());  // Square

    }
}
