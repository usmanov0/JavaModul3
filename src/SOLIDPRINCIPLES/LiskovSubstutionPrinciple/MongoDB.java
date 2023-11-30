package SOLIDPRINCIPLES.LiskovSubstutionPrinciple;

public class MongoDB implements NoSQLDB{
    @Override
    public void save() {
        System.out.println("Table Saved");
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
        System.out.println("Selected from table");
    }

    @Override
    public void update() {
        System.out.println("Table updated");
    }

    @Override
    public void createCollection() {
        System.out.println("Collection created");
    }
}
