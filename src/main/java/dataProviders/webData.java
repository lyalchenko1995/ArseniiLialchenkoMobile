package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class webData {

    public static Properties getPropertyObject() throws IOException {
        String path = new File("src\\test\\resources\\properties\\webGoogle.properties").getAbsolutePath();
        FileInputStream fp = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fp);
        return prop;
    }

    public static String getSearchEngineProperties() throws IOException {
        return getPropertyObject().getProperty("googleLink");
    }

    public static String getKeyWordProperties() throws IOException {
        return getPropertyObject().getProperty("searchKey");
    }

}
