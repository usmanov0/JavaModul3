package LegacyCollections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyMaps {
    public static void main(String[] args) {
        try {
            var properties = new Properties();
            var propertiesfilePath = "src/LegacyCollections/PropCollections";
            var reader = new FileReader(propertiesfilePath);
            properties.load(reader);
//            String  o = properties.getProperty("datasource.username");
//            System.out.println(o);
//            String property = properties.getProperty("datasource.password");
//            System.out.println(property);
//            String message = properties.getProperty("message");
//            System.out.println(message);
            properties.forEach((k,v)-> System.out.println(k+"="+v));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
