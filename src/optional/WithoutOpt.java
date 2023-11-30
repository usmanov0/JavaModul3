package optional;

import java.util.Optional;
import java.util.Random;

public class WithoutOpt {
    public static void main(String[] args) {
        Optional<Card> cardOptional = findByPan("9860 **** **** ****");
        System.out.println(cardOptional.get().holdername());
//        if(card == null){
//            System.out.println("UNKNOWN");
//        }else {
//            System.out.println(card.holdername());
//        }
    }
    static Optional<Card> findByPan(String pan){
        var random = new Random();
        if(random.nextBoolean()){
            return Optional.of(new Card("Usmonov Azizbek",pan,"01/27"));
        }
        return Optional.empty();
    }

}
