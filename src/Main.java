public class Main {
    public static void main(String[] args) {
    String number = MyInteger.tobinaryString(16,16);
    System.out.println(number);
}
}
class MyInteger {
    public static String  tobinaryString(long number,int regax) {
        if(regax == 2){
            String bin = "";
            while(number > 0){
                bin = (number % 2) + bin;
                number = number / 2;
            }
            return bin;
        }
        if(regax == 16){
            int rem;
            String hex_16 = "";
            char chars []={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            while(number>0)  {
                rem = (int) (number % 16);
                hex_16 = chars[rem] + hex_16;
                number = number / 16;
            }
            return hex_16;
        }
        return "";
    }
}