package lab10.adapter.exe02;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        target.execute();   // Target executed.

        Adaptee adaptee = new Adaptee();
        // adaptee.execute(); // adaptee can't use execute() method of instance Target

        Adapter adapter = new Adapter(adaptee);
        // Now, by use adapter, adaptee can use execute() of Target
        adapter.execute();  // Adaptee executed.

    }
}
