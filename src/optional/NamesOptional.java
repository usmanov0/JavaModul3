package optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NamesOptional {
    public static void main(String[] args) {
        String[] names = {"Ali","MuhammadAli","Yusuf","Muhammad","Umar","Jamshid","Alisher","Zokir","Umid","Rustam",
        "Ibrohim","MuhammadYusuf","AliYusuf","Muhammadbek","Isroil","Bahodir","Shohruh","Javohir","Muslim","Rustam"};
        List<String> list = Arrays.asList(names);
        Collections.shuffle(list);
        Collections.sort(list);
        Optional<List<String>> optional = Optional.of(list);
//        if(optional.isPresent()){
//            List<String> sort = optional.get();
//            System.out.println(sort);
//            }else {
//            System.out.println(" ");
//        }
    }
}
