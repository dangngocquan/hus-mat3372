package lab11.visitor.exe02;

public interface ComputerPart {
    public void accept(ComputerPartVisitor v);
}
