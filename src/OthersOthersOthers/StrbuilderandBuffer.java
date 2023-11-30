package OthersOthersOthers;

public class StrbuilderandBuffer {
    public static void main(String[] args){
        String s = "Aziz";
        StringBuilder str =  new StringBuilder();
        str.append("Hello");
        str.append(" ");
        str.append("world ");
        str.append(s);
        System.out.println(str);

        StringBuffer sa = new StringBuffer();
        sa.append("a");
        sa.append("b");
        sa.append("c");
        System.out.println(sa);
    }
}
