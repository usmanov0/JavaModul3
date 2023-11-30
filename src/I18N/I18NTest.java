package I18N;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class I18NTest {
    public static void main(String[] args) {
        Locale english = Locale.ENGLISH;
        Locale french = Locale.FRENCH;
        Locale japan = Locale.JAPAN;
        Locale china = Locale.CHINA;
        //Locale russian = Locale.forLanguageTag("russian");
        //Locale rus = new Locale("rus","Russia");
        Locale uz = Locale.forLanguageTag("uz");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,uz);
        String format = dateFormat.format(new Date());
        System.out.println(format);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(china);
        double formatt = 123045.921;
        System.out.println(numberFormat.format(formatt));
        System.out.println(english.getDisplayLanguage(french));
        System.out.println(english.getDisplayLanguage(japan));
        System.out.println(english.getDisplayLanguage(china));
        System.out.println(english.getDisplayLanguage(uz));
        System.out.println(english.getCountry());
    }
}
