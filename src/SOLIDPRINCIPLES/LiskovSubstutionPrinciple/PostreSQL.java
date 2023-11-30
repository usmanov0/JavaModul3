package SOLIDPRINCIPLES.LiskovSubstutionPrinciple;

public class PostreSQL implements SqlDB{
    @Override
    public void save() {
        System.out.println("Saved to table");
    }

    @Override
    public void delete() {
        System.out.println("Deleted from table");
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void select() {
        System.out.println("Table Selected");
    }

    @Override
    public void update() {
        System.out.println("Table Updated");
    }


    @Override
    public void createtable() {
        System.out.println("Table Created");
    }
}
