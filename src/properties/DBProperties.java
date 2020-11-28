package properties;

import java.io.IOException;
import java.util.Properties;

public class DBProperties {
    private static Properties pro;

    static {

        pro = new Properties();
        try {
            pro.load(DBProperties.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String getProperties(String key) {
        return pro.getProperty(key);
    }
}