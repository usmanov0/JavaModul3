import java.util.*;

public class TranslateTask3 {
    private Map<String, List<String>> dictionary;

    public TranslateTask3(){
        dictionary = new HashMap<>();
        dictionary.put("Salom".toLowerCase(), Arrays.asList("Hello".toLowerCase()));
        dictionary.put("Xayr".toLowerCase(),Arrays.asList("Goodbye".toLowerCase()));
        dictionary.put("Qayerda".toLowerCase(),Arrays.asList("Where".toLowerCase()));
        dictionary.put("Qachon".toLowerCase(),Arrays.asList("When".toLowerCase()));
        dictionary.put("Qanday".toLowerCase(),Arrays.asList("How".toLowerCase()));
        dictionary.put("Hammasi joyidami?".toLowerCase(),Arrays.asList("Are you okay?".toLowerCase()));
    }
    public void printTranslator(String word) {
        if (dictionary.containsKey(word)) {
            List<String> translator = dictionary.get(word);
            System.out.println("UZBEK --> ENGLISH");
            System.out.println(word + " -> " + String.join(", ", translator));
        } else {
            for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
                if (entry.getValue().contains(word)) {
                    System.out.println("ENGLISH --> UZBEK");
                    System.out.println(word + " -> " + entry.getKey());
                }
            }
        }
    }
    public static void main(String[] args) {
        var dict = new TranslateTask3();
        Scanner scanner = new Scanner(System.in);
        System.out.print("So'z kiriting: ");
        String word = scanner.nextLine();
        dict.printTranslator(word);
    }
}
