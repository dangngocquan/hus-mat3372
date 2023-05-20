package lab11.factorymethod.exe02;

public class ShapeFactory {
    public Shape createShape(String type) {
        switch (type) {
            case "TRIANGLE":
                return new Triangle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                return null;

        }
    }
}
