package DynamicArray;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArrays<E> {
    private Object [] element;
    private int size = 0;
    public DynamicArrays(int capacity){
        this.element = new Object[capacity];
    }
    public DynamicArrays(){
        this(10);
    }
    public boolean add(Object item){
        if(size == element.length){
            grow();
        }
        element[size] = item;
        size++;
        return true;
    }
    @SuppressWarnings("unchecked")
    public E get(int index){
        //if(index < 0 || index > element.length) throw new IllegalArgumentException("Index bounds Exception"); yoki
        Objects.checkIndex(index,element.length);
        return (E) element[index];
    }
    @SuppressWarnings("unchecked")
    public E remove(int index){
        Objects.checkIndex(index,element.length);
        Object oldval = element[index];
        Integer newsize;
        if((newsize=size-1)>index)
            System.arraycopy(element,index+1,element,index,newsize-index);
        element[size = newsize] = null;
        size = newsize;
        return (E) oldval;
    }
    @Override
    public String toString() {
        return  Arrays.toString(Arrays.copyOf(element,size));
    }

    private void grow() {
        int newcapacity = element.length + element.length / 2 + 1;
        element = Arrays.copyOf(element,newcapacity);
    }

    public static void main(String[] args) {
        DynamicArrays<Object> dynamicArrays = new DynamicArrays<>();
        dynamicArrays.add(12);
        dynamicArrays.add(4);
        dynamicArrays.add(45);
        dynamicArrays.add(19);
        dynamicArrays.add(17);
        dynamicArrays.add("S");
        dynamicArrays.add(134D);
        System.out.println(dynamicArrays.toString());
        System.out.println(dynamicArrays.remove(3));
        System.out.println(dynamicArrays.toString());
    }
}
