package April;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFiles {
    public static void main(String[] args)
    {
        FileInputStream file = null;
        try {
            file = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();
        try {
            prop.load(file);
            prop.getProperty("username");
            prop.getProperty("password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
