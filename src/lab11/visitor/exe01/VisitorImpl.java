package lab11.visitor.exe01;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("Visitor visited Business book");
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Visitor visited Design Pattern book");
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("Visitor visited Java Core book");
    }
}
