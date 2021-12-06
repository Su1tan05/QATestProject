package Project.Utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final String configFilePath= "src/test/java/Project/Resources/Configuration..properties";
    private static final String testDataFilePath= "src/test/java/Project/Resources/TestData.properties";

    public static String getProperty(String key) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream(configFilePath);
            prop.load(input);
            prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

    public static String getTestData(String key) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream(testDataFilePath);
            prop.load(input);
            prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}