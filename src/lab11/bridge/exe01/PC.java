package lab11.bridge.exe01;

public class PC extends Computer {
    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        System.out.print("PC, ");
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        System.out.print("PC, ");
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}
