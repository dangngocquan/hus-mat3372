package lab10.decorator.exe01;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();
        System.out.println();
        ShapeDecorator shapeRedDecorator = new RedShapeDecorator(shape1);
        shapeRedDecorator.draw();
    }
}
