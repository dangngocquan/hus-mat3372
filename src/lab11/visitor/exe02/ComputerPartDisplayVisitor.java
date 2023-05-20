package lab11.visitor.exe02;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Visitor visited " + computer);
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visitor visited " + keyboard);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visitor visited " + mouse);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visitor visited " + monitor);
    }
}
