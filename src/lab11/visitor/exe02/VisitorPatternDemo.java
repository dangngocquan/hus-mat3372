package lab11.visitor.exe02;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Computer computer = new Computer(new ComputerPart[]{keyboard, mouse, monitor});

        keyboard.accept(visitor);   // Visitor visited Keyboard
        mouse.accept(visitor);  // Visitor visited Mouse
        monitor.accept(visitor);    // Visitor visited Monitor
        computer.accept(visitor);   // Visitor visited Computer[Keyboard, Mouse, Monitor]
    }
}
