package lab11.visitor.exe03;

public class XMLExportVisitor implements Visitor {
    @Override
    public void visitDot(Dot d) {
        System.out.println("Export the dot\'s ID and center coordinates.");
    }

    @Override
    public void visitCircle(Circle c) {
        System.out.println("Export the circle's ID, center coordinates and radius.");
    }

    @Override
    public void visitRectangle(Rectangle r) {
        System.out.println("Export the rectangle's ID, left-top coordinates, width and length.");
    }

    @Override
    public void visitCompoundShape(CompoundShape cs) {
        System.out.println("Export the shape's ID as well as the list of its children's IDs.");
    }
}
