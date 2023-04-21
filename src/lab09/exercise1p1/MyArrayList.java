package lab09.exercise1p1;

public class MyArrayList extends MyAbstractList {
    private int size;
    private final int DEFAULT_CAPACITY = 32;
    private Object[] elements;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private void enlarge() {
        Object[] newData = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = elements;
        }
        elements = newData;
    }

    @Override
    public void add(Object object, int index) {
        if (size == elements.length) {
            enlarge();
        }
        this.checkBoundaries(index, size+1);
        for (int i = size-1; i >= index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = object;
        size++;
    }

    @Override
    public void remove(int index) {
        this.checkBoundaries(index, size);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        this.checkBoundaries(index, size);
        return elements[index];
    }

    @Override
    public void add(Object object) {
        if (size == elements.length) {
            this.enlarge();
        }
        this.elements[size] = object;
        size++;
    }
}
