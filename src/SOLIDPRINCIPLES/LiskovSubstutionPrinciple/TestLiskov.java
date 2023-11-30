package SOLIDPRINCIPLES.LiskovSubstutionPrinciple;

public class TestLiskov {
    public static void main(String[] args) {
        call(new PostreSQL());
        call(new MongoDB());
}
static void call(Database database){
        database.save();
        database.delete();
        System.out.println(database.get());
}
    }

