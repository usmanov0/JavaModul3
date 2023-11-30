package JavaCollections;
import org.w3c.dom.Node;

import java.util.StringJoiner;
public class DoubleLinkedLists<E>  {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public boolean add(E element){
        var l = tail;
        var newNode = new Node<>(element);
        tail = newNode;
        if (l == null){
            head = newNode;
        }else {
            l.next = newNode;
            newNode.prev = l;
        }
        size++;
        return true;
    }
    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        var dl = new DoubleLinkedLists<String>();
        dl.add("Fayoz");
        dl.add("Aziz");
        dl.add("Rustam");
        System.out.println(dl);
    }
}
