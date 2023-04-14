package lab08.exercise3p3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    /**
     * FUnction to return the number of key-value mappings of a map
     * @param map
     * @return
     */
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    /**
     * FUnction to remove all mappings from a map
     * @param map
     */
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    /**
     * FUnction to test if a map contains a mapping for the specified key
     * @param map
     * @param key
     * @return
     */
    public static boolean contain(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    /**
     * FUnction to test if a map contains a mapping for
     * the specified key and if its value equals the specified value
     * @param map
     * @param key
     * @param value
     * @return
     */
    public static boolean containsKeyValue(Map<Integer, Integer> map,
                                           int key,
                                           int value) {
        for (int key0 : map.keySet()) {
            if (key0 == key && map.get(key0) == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function to return the key set of map
     * @param map
     * @return
     */
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    /**
     * Function to return the values of a map
     * @param map
     * @return
     */
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    /**
     * Function, internally using a map, returning "black, "white", or
     * "red" depending on int input value.
     * "black" = 0, "white" = 1, "red" = 2
     * @param value
     * @return
     */
    public static String getColor(int value) {
        if (value > 2 || value < 0) {
            return null;
        }
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        return map.get(value);
    }
}
