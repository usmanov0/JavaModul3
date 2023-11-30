package JavaCollections;

import java.util.Iterator;
public class MyList implements Iterable<Integer> {
    private int[] elements;

    public MyList(int[] elements) {
        this.elements = elements;
    }

    public Iterator<Integer> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<Integer> {
        private int index = 0;

        public boolean hasNext() {
            return index < elements.length;
        }

        public Integer next() {
            return elements[index++];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    // Example usage
    public static void main(String[] args) {
        MyList myList = new MyList(new int[]{1, 2, 3, 4, 5});

        for (int element : myList) {
            System.out.println(element);
        }
    }
}