package geenrics;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayLists <E>{
    private E[] elements;
    private int size;

    public ArrayLists() {
        elements = (E[]) new Object [10];
        size = 0;
    }

    public void add(E element){
        if(size == elements.length){
            E[] newelements = (E[]) new Object[elements.length * 3/2+1];
            for (int i = 0; i < size; i++) {
                newelements[i] = elements[i];
            }
            elements = newelements;
        }
        elements[size] = element;
        size++;
    }


    public void remove(int index){
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }


    public E get(int index){
        return elements[index];
    }


    public int size(){
        return size;
    }


    public void clear(){
        elements = (E[]) new Object[10];
        size = 0;
    }


    public boolean isEmpty(){return size == 0;
    }

    public static void main(String[] args) {
        ArrayLists arrayLists = new ArrayLists<>();
        arrayLists.add("Hello USA");
        arrayLists.add("Hello Uzbekistan");
        arrayLists.add("Hello New York");
        arrayLists.add("Hello Tashkent");
        System.out.println(arrayLists.size);
        System.out.println(arrayLists.get(0));
        arrayLists.remove(0);
        System.out.println(arrayLists.size);
//        System.out.println(arrayLists.get(0));
        System.out.println(arrayLists.isEmpty());
        //arrayLists.clear();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(1,"as");
        arrayList.add("ass");
    }
}
