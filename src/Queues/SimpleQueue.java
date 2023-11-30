package Queues;

import java.util.Arrays;

public class SimpleQueue {
    private Object[] elements;
    private int size = 0;
    private static int defaultcap = 0;

    public SimpleQueue(int capacity) {
        this.elements = new Object[capacity];
    }
    public int size(){
        return size;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean enqueue(Object element){
        if(isFull()) return false;
        elements[size++] = element;
        return true;
    }
    public Object dequeue(){
        if(isEmpty()) throw new RuntimeException("Queue is Empty");
        Object frontelement = elements[0];
        System.arraycopy(elements,1,elements,0,size - 1);
        elements[size-1] = null;
        size--;
        return frontelement;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public static void main(String[] args) {
        var queue = new SimpleQueue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(50);
        queue.enqueue(50);
        queue.enqueue(50);
        queue.enqueue(50);
        queue.enqueue(50);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        //System.out.println(queue.size);
    }
}
