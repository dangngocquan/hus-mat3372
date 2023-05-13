package lab10.adapter.exe02;

public class Adapter extends Target {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void execute() {
        adaptee.specificExecute();
    }
}
