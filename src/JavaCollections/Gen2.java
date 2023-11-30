package JavaCollections;

public class Gen2 {
    public static void main(String[] args) {
        MyCLass<Integer,String>myCLass = new MyCLass<>(1,"Islom");
        Integer Val = myCLass.getVal();
        String tval = myCLass.getTypeval();
        GenMethod.getTest(12,13);
    }
}
class MyCLass<E,U>{
    E val;
    U typeval;

    public MyCLass(E val,U typeval) {
        this.val = val;
        this.typeval = typeval;
    }
    public MyCLass(){
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public U getTypeval() {
        return typeval;
    }

    public void setTypeval(U typeval) {
        this.typeval = typeval;
    }
}
class GenMethod{
    static <T,D> void getTest(T value, D value2){
        System.out.println(value);
        System.out.println(value2);
    }
}
