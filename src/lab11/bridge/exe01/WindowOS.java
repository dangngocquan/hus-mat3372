package lab11.bridge.exe01;

public class WindowOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Window Operating System startup ...");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Window Operating System loading url=" + url);
    }
}
