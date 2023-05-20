package lab11.bridge.exe01;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        System.out.print("Laptop, ");
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        System.out.print("Laptop, ");
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}
