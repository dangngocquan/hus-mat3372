package lab11.bridge.exe03;

public class Client {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();
        Shape circle = new Circle(red);
        Shape square = new Square(blue);

        System.out.println(circle); // Circle[color=Red]
        System.out.println(square); // Square[color=Blue]
    }
}
