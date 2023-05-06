package lab10.decorator.exe01;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.print(" color red");
    }

    private void setRedBorder() {

    }
}
