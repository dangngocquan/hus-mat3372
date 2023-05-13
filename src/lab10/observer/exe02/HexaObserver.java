package lab10.observer.exe02;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Updated status.");
    }
}
