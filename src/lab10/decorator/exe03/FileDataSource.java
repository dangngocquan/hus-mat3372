package lab10.decorator.exe03;

import java.io.*;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOS = new FileOutputStream(filename, false);
            OutputStreamWriter writer = new OutputStreamWriter(fileOS, "UTF-8");

            writer.write(data);

            writer.close();
            fileOS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream file = new FileInputStream(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(file, "UTF-8");
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            // Close
            reader.close();
            inputStreamReader.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
