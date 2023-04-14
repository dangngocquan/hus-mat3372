package lab08.exercise3p2;

import java.util.*;

public class Sets {
    /**
     * FUnction returning the intersection of two given sets
     * (without using library functions)
     * @param first
     * @param second
     * @return
     */
    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        Set<Integer> intersectionSet = new LinkedHashSet<>();
        for (int element : first) {
            if (second.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }

    /**
     * Function returning the union of two given sets
     * (without using library methods)
     * @param first
     * @param second
     * @return
     */
    public static Set<Integer> unionManual(Set<Integer> first,
                                           Set<Integer> second) {
        Set<Integer> unionSet = new LinkedHashSet<>();
        for (int element : first) {
            unionSet.add(element);
        }
        for (int element : second) {
            unionSet.add(element);
        }
        return unionSet;
    }

    /**
     * Function returning the intersection of two given sets
     * (see retainAll())
     * @param first
     * @param second
     * @return
     */
    public static Set<Integer> intersection(Set<Integer> first,
                                            Set<Integer> second) {
        Set<Integer> intersectionSet = new LinkedHashSet<>(first);
        intersectionSet.retainAll(second);
        return intersectionSet;
    }

    /**
     * FUnction returning the union of two sets (see addAll())
     * @param first
     * @param second
     * @return
     */
    public static Set<Integer> union(Set<Integer> first,
                                     Set<Integer> second) {
        Set<Integer> unionSet = new LinkedHashSet<>(first);
        unionSet.addAll(second);
        return unionSet;
    }

    /**
     * Function to transform a set ino a list without duplicates
     * Note well: collections can be created from another collection !
     * @param source
     * @return
     */
    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new LinkedList<Integer>(source);
        return list;
    }

    /**
     * Function to remove duplicate from a list
     * Note well: collections can be created from another collection!
     * @param source
     * @return
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<Integer>(source);
        List<Integer> list = new LinkedList<Integer>(set);
        return list;
    }

    /**
     * Function to remove duplicate from a list without
     * using the constructors trick seen above
     * @param source
     * @return
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> list = new LinkedList<Integer>();
        for (int element : source) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        return list;
    }

    /**
     * Function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> "a"
     * @param s
     * @return
     */
    public static String firstRecurringCharacter(String s) {
        if (s.isEmpty()) {
            return "";
        }
        List<Character> list = new LinkedList<Character>();
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if (list.contains(c)) {
                return c + "";
            } else {
                list.add(c);
            }
        }
        return s.charAt(0) + "";
    }

    /**
     * FUnction accepting a string s
     * and returning a set comprising all recurring characters
     * For example allRecurringChars("mamma") -> {'m', 'a'}
     * @param s
     * @return
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new LinkedHashSet<Character>();
        for (int index = 0; index < s.length(); index++) {
            set.add(s.charAt(index));
        }
        return set;
    }

    /**
     * Function to transform a set into an array
     * @param source
     * @return
     */
    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        int index = 0;
        for (int element : source) {
            array[index] = element;
            index++;
        }
        return array;
    }

    /**
     * Function to return the first item from a TreeSet
     * Note well: use TreeSet specific methods
     * @param source
     * @return
     */
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    /**
     * Function to return the last item from a TreeSet
     * Note well: use TreeSet specific methods
     * @param source
     * @return
     */
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    /**
     * Function to get an element from a TreeSet which is strictly
     * greater than a given element
     * Note well: use TreeSet specific methods
     * @param source
     * @param value
     * @return
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

}
