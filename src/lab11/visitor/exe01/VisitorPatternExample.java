package lab11.visitor.exe01;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();
        BusinessBook book1 = new BusinessBook();
        DesignPatternBook book2 = new DesignPatternBook();
        JavaCoreBook book3 = new JavaCoreBook();

        book1.accept(visitor);   // Visitor visited Business book
        book2.accept(visitor);   // Visitor visited Design Pattern book
        book3.accept(visitor);   // Visitor visited Java Core book

    }
}
