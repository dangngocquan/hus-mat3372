package lab09.exercise1p1;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {

    }

    void checkBoundaries(int index, int limit) {
        if (index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            sb.append(String.format("[%s] ", get(i).toString()));
        }
        return sb.toString();
    }
}
