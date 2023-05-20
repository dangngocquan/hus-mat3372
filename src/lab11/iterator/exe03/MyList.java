package lab11.iterator.exe03;

public interface MyList extends MyIterable {
    int size();

    Object get(int index);

    void set(Object payload, int index);

    void append(Object payload);

    void insert(Object payload, int index);

    void remove(int index);
}
