package lab11.visitor.exe02;

public class Computer implements ComputerPart {
    public ComputerPart[] parts;

    public Computer(ComputerPart[] parts) {
        this.parts = parts;
    }

    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Computer[");
        for (ComputerPart part : parts) {
            sb.append(part.toString()).append(", ");
        }
        if (sb.length() > 9) {
            sb.delete(sb.length()-2, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }
}
