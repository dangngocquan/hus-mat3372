package lab11.visitor.exe03;

public interface Shape {
    public void move(int x, int y);

    public void draw();

    public void accept(Visitor v);
}
