package lab11.factorymethod.exe01;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendered HTML Button");
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button on click ...");
    }
}
