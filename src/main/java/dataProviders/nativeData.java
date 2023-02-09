package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class nativeData {

    public static Properties getPropertyObject() throws IOException {
        String path = new File("src\\test\\resources\\properties\\nativeLogin.properties").getAbsolutePath();
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }

    public static String getEmailProperties() throws IOException {
        return getPropertyObject().getProperty("email");
    }

    public static String getUserNameProperty() throws IOException {
        return getPropertyObject().getProperty("userName");
    }

    public static String getUserPasswordProperty() throws IOException {
        return getPropertyObject().getProperty("password");
    }

}
