package lab11.bridge.exe03;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
