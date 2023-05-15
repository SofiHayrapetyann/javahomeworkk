package ArrayList16;

import java.util.ArrayList;

public class myArrayList <E> {
    private Object[] array = new Object[10];
    private int length;
    private int index;


    public void add(Object element) {
        array[length++] = element;
        System.out.println("asdfg");

    }

    public E get(int index) {
        try {
            if (index < 0 || index >= length)
                throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OOPS,Index is out of bounds");
        }
        return (E) array[index];

    }

    public void add(int index, E element) {
        try {
            if (index < 0 || index >= length)
                throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OOPS,Index is out of bounds");
        }
        array[index] = element;
        length++;
    }

    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        E removed = (E) array[index];
        array[--length] = null;

    }
    public int size(){
        return length;
    }
}

