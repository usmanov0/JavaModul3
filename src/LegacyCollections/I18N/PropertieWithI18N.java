package LegacyCollections.I18N;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class PropertieWithI18N {
    public static void main(String[] args) {
        Locale english = Locale.ENGLISH;
        Locale uz = Locale.forLanguageTag("uz");
        try {
            var proptest = new Properties();
            var propertiesfile = "src/LegacyCollections/I18N/Propertiess";
            var reader = new FileReader(propertiesfile);
            proptest.load(reader);
            proptest.forEach((key,value)-> System.out.println(english.getDisplayLanguage(uz)+" "+key+"  "+
                    value+" "+uz.getDisplayLanguage(english)+"cha"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
