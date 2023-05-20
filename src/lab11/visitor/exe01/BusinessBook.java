package lab11.visitor.exe01;

public class BusinessBook implements Book {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "Publisher?";
    }
}
