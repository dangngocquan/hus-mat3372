package lab11.bridge.exe01;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Mac Operating System startup ...");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Mac Operating System loading url=" + url);
    }
}
