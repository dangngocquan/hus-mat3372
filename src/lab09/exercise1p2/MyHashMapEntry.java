package lab09.exercise1p2;

public class MyHashMapEntry {
    private Object key;
    private Object value;

    MyHashMapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }
}
