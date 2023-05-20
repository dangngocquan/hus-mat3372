package lab11.factorymethod.exe03;

public class Apple implements Fruit {
    public Apple() {
        productJuice();
    }

    @Override
    public void productJuice() {
        System.out.println("Produced Apple");
    }
}
