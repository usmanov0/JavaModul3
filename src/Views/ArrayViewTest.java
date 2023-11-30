package Views;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayViewTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        // Vairable argumentlardam o'zimiz xoxlagan collection yaratish;
        List<String> lststr = List.of("Java","Kotlin","C#","C++","C");
        System.out.println(lststr);
        Set<Integer> set = Set.of(1,2,3,4,5,6);
        System.out.println(set);
        Map<String,String> dict = Map.of(
                "hello","Assalomu Alaykum",
                "Bye","Xayr");
        System.out.println(dict);
        //Portion of collection
        List<String> strings = lststr.subList(1,3); //Listni bitta portionini olish
        System.out.println(strings);
    }
}
