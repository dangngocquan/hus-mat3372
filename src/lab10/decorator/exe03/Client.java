package lab10.decorator.exe03;

public class Client {
    public static void main(String[] args) {
        DataSource dataSource01 = new FileDataSource("./src/lab10/decorator/exe03/data01.txt");
        dataSource01.writeData("Hello Java");
        System.out.println(dataSource01.readData());  // Hello Java

        DataSource dataSource02 = new FileDataSource("./src/lab10/decorator/exe03/data02.txt");
        DataSourceDecorator dataSourceDecorator02 = new EncryptionDecorator(dataSource02);
        dataSourceDecorator02.writeData("Encrypted text");
        System.out.println(dataSourceDecorator02.readData());   // Encrypted text

        DataSource dataSource03 = new FileDataSource("./src/lab10/decorator/exe03/data03.txt");
        DataSourceDecorator dataSourceDecorator03 = new CompressionDecorator(dataSource03);
        dataSourceDecorator03.writeData("Compression text");
        System.out.println(dataSourceDecorator03.readData());   // Compression text
    }
}
