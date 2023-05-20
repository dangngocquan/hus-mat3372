package lab11.visitor.exe01;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "";
    }
}
