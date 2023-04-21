package lab09.exercise1p2;

public class MyHashMap implements MyMap {
    MyHashMapEntry[] table;
    final static int INITIAL_SIZE = 32;
    int size;

    public MyHashMap() {

    }

    @Override
    public int size() {
        return size;
    }

    double capacityRatio() {
        return size / (double) table.length;
    }

    void correct() {
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i] == null && table[i+1] != null) {
                table[i] = table[i+1];
                table[i+1] = null;
            }
        }
    }

    @Override
    public void remove(Object key) {
        for (int i = 0; i < size; i++) {
            MyHashMapEntry pair = table[i];
            if (pair.getKey() == key) {
                table[i] = null;
                size--;
                break;
            }
        }
        correct();
    }

    void enlarge() {
        MyHashMapEntry[] newData = new MyHashMapEntry[size*2];
        for (int i = 0; i < size; i++) {
            newData[i] = table[i];
        }
        table = newData;
    }

    @Override
    public boolean contains(Object key) {
        for (int i = 0; i < size; i++) {
            MyHashMapEntry pair = table[i];
            if (pair.getKey() == key) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            MyHashMapEntry pair = table[i];
            if (pair.getKey() == key) {
                return (Object) pair;
            }
        }
        return null;
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n",
                        i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }


}
