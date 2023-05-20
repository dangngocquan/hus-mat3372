package lab11.bridge.exe03;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%s[color=%s]", getType(), color.getName());
    }
}
