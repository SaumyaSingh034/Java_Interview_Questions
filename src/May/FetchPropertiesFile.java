package May;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchPropertiesFile {
    public static void main(String[] args){

        try {
            FileInputStream file = new FileInputStream(new File("src/resources/data.properties"));
            Properties prop = new Properties();
            prop.load(file);
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
