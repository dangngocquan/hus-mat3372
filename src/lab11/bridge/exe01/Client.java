package lab11.bridge.exe01;

public class Client {
    public static void main(String[] args) {
        OperatingSystem windowOS = new WindowOS();
        OperatingSystem macOS = new MacOS();

        Computer laptop1 = new Laptop(windowOS);
        Computer laptop2 = new Laptop(macOS);
        Computer pc1 = new PC(windowOS);
        Computer pc2 = new PC(macOS);

        laptop1.startup();  // Laptop, Window Operating System startup ...
        laptop2.startup();  // Laptop, Mac Operating System startup ...
        pc1.startup();  // PC, Window Operating System startup ...
        pc2.startup();  // PC, Mac Operating System startup ...

        laptop1.browseInternet("java.com"); // Laptop, Window Operating System loading url=java.com
        laptop2.browseInternet("genesis.com");  // Laptop, Mac Operating System loading url=genesis.com
        pc1.browseInternet("facebook.com"); // PC, Window Operating System loading url=facebook.com
        pc2.browseInternet("github.com");   // PC, Mac Operating System loading url=github.com
    }
}
