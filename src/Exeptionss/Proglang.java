package Exeptionss;

public class Proglang {
    public static void main(String[] args) {
        Method(null,null,null);
    }
    private static void Method(String name, String owner, String ReleaseDate){
        try {
            if (name != null) System.out.println(name);
            if (owner != null) System.out.println(owner);
            if (name != null) System.out.println(ReleaseDate);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
