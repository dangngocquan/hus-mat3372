package midterm.y2023.solution.exe01.oop.principles.inheritance;

public class Test {
    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rect = new Rectangle(5, 2);
        System.out.println(rect);   // Rectangle[length=5.0, width=2.0]
        System.out.println("length = " + rect.getLength()); // length = 5.0
        System.out.println("width = " + rect.getWidth()); // width = 2.0
        rect.setWidth(10);
        rect.setLength(20);
        System.out.println(rect);   // Rectangle[length=20.0, width=10.0]

        System.out.println();

        // Test Square
        // Class Square kế thừa class Rectangle nên sẽ có những thuộc tính và phương thức
        // của class Rectangle
        Square square = new Square(2);
        System.out.println(square); // Square[Rectangle[length=2.0, width=2.0]]
        System.out.println("side = " + square.getSide());   // side = 2.0
        square.setSide(10);
        System.out.println(square); // Square[Rectangle[length=10.0, width=10.0]]
        square.setLength(20);
        System.out.println(square); // Square[Rectangle[length=20.0, width=20.0]]

    }
}
