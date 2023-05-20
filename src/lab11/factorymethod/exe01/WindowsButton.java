package lab11.factorymethod.exe01;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendered Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button on click ...");
    }
}
