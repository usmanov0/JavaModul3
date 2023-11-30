package SOLIDPRINCIPLES.LiskovSubstutionPrinciple;

public interface Database {
    void save();
    void delete();
    Object get();
    void select();
    void update();
}
