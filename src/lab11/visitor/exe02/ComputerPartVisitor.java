package lab11.visitor.exe02;

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Keyboard keyboard);

    public void visit(Mouse mouse);

    public void visit(Monitor monitor);
}
