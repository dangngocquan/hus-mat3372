package lab11.iterator.exe03;

import java.util.Arrays;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    @Override
    public void set(Object payload, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        data[index] = payload;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index + 1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
    }

    @Override
    public void append(Object payload) {
        if (size == data.length) {
            enlarge();
        }
        data[size] = payload;
        size++;
    }

    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == data.length) {
            enlarge();
        }

        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = payload;
        size++;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(Arrays.copyOf(data, size));
    }

    private void enlarge() {
        Object[] newData = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
