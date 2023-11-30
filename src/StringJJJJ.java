public class StringJJJJ {
    public static void main(String[] args) {
        String input = "a3 simple4 is2 This1";
        String[] words = input.split("\\s+");
        String[] rearrangedWords = new String[words.length];
        for (String word : words) {
            int position = Integer.parseInt(word.replaceAll("\\D+", "")) - 1;
            rearrangedWords[position] = word.replaceAll("\\d", "");
        }
        String output = String.join(" ", rearrangedWords);
        System.out.println(output);
    }
}
