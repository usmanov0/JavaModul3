package geenrics;

public class GenericMethodTask1 {
    public static void main(String[] args) {
        int compareTo = GenericMethodTask1.compare(10,10); //if (obj1 > obj2) 1;  else if(obj1 < obj2) -1; else 0;
        System.out.println(compareTo);
    }
    public static <T extends Comparable<T>> int compare(T obj1, T obj2){
        return obj1.compareTo(obj2);
    }
}
