package Exeptionss;
import java.io.IOException;

public class ProgrammingLanguage {
    private String name = null;
    private String owner = null;
    private String releaseDate = null;

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        if(language.name == null || language.owner == null || language.releaseDate == null) {
            throw new NullPointerException();
    }
        System.out.println(language.toString());

}}
