package lab11.visitor.exe03;

public class Application {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Dot(),
                new Circle(),
                new Rectangle(),
                new CompoundShape()
        };

        Visitor visitor = new XMLExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
        // Export the dot's ID and center coordinates.
        // Export the circle's ID, center coordinates and radius.
        // Export the rectangle's ID, left-top coordinates, width and length.
        // Export the shape's ID as well as the list of its children's IDs.
    }
}
