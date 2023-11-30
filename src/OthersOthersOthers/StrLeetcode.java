package OthersOthersOthers;

import java.util.Scanner;
public class StrLeetcode {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    sum+=1;
                    break;
                case 'V':
                    sum+=5;
                    break;
                case 'X':
                    sum+=10;
                    break;
                case 'L':
                    sum+=50;
                    break;
                case 'C':
                    sum+=100;
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
            }
        }
        System.out.println(sum);
    }
}
