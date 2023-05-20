package lab11.visitor.exe02;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "Monitor";
    }
}
