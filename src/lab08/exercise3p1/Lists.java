package lab08.exercise3p1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    /**
     * Function to insert an element into a list at the beginning
     * @param list
     * @param value
     */
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     * @param list
     * @param value
     */
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     * @param list
     * @param value
     */
    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    /**
     * /∗∗
     * 29 ∗ Function to remove the 3 rd element from a list
     * @param list
     */
    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }

    /**
     * Function to remove the element ”666” from a list
     * @param list
     */
    public static void removeEvil(List<Integer> list) {
        list.remove(Integer.valueOf(666));
    }

    /**
     * Function returning a List<Integer> containing the
     * first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     * @return
     */
    public static List<Integer> generateSquare() {
        List<Integer> list = new LinkedList<Integer>();
        for (int value = 1; value <= 10; value++) {
            list.add(value * value);
        }
        return list;
    }

    /**
     * Function to verify if a list contains a certain value
     * @param list
     * @param value
     * @return
     */
    public static boolean contains(List<Integer> list, int value) {
        for (int element : list) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function to copy a list into another list (without using library functions)
     * Note well: the target list must be emptied before the copy
     * @param source
     * @param target
     */
    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        for (int element: source) {
            target.add(element);
        }
    }

    /**
     * FUnction to reverse the elements of a list
     * @param list
     */
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    /**
     * Function to reverse the elements of a list
     * (without using library functions)
     * @param list
     */
    public static void reverseManual(List<Integer> list) {
        int size = list.size();
        for (int index = 0; index < size / 2; index++) {
            int value1 = list.get(index);
            int value2 = list.get(size - 1 - index);
            list.set(index, value2);
            list.set(size - 1 - index, value1);
        }
    }

    /**
     * FUnction to insert the same element both at the beginning
     * and the end of the same LinkedList
     * Note well: you can use LinkedList specific methods
     * @param list
     * @param value
     */
    public static void insertBeginningEnd(LinkedList<Integer> list,
                                          int value) {
        list.add(0, value);
        list.add(value);
    }
}
