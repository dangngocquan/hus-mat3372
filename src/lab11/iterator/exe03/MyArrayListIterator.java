package lab11.iterator.exe03;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;
    public MyArrayListIterator(Object[] data) {
        this.data = data;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < data.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Object object = data[currentPosition];
            currentPosition++;
            return  object;
        }
        return null;
    }
}
