package lab11.bridge.exe03;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String getType() {
        return "Square";
    }
}
