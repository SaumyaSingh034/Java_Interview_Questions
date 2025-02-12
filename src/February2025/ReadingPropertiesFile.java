package February2025;

import java.io.*;
import java.util.Properties;

public class ReadingPropertiesFile {
    public static void main(String[] args){
        Properties prop = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream("src/resources/data.properties");
            prop.load(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("desg"));

    }
}
