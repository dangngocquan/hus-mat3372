package lab09.exercise1p2;

public interface MyMap {
    public int size();

    public void put(Object key, Object value);

    public void remove(Object key);

    public boolean contains(Object key);

    public Object get(Object key);
}
