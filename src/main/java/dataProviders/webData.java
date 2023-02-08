package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class webData {

    public static Properties getPropertyObject() throws IOException {
        String path = new File("src\\test\\resources\\properties\\webGoogle.properties").getAbsolutePath();
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }

    public static String getGoogleLinkProperty() throws IOException {
        return getPropertyObject().getProperty("googleLink");
    }

    public static String getSearchKeyProperty() throws IOException {
        return getPropertyObject().getProperty("searchKey");
    }

}
