package cs1302.sorting;

import java.util.*;

/**
 * Bubble Sort class.
 */
public class BubbleSort {

    public static void main(String[] args) {

        Integer [] array = {10, 1, 4, 5, 3, 2};
        System.out.println("Original Integer array: " + Arrays.toString(array));
        bubbleSort(array, 0, 5, Integer::compareTo);
        System.out.println("Testing using just bubbleSort method: " + Arrays.toString(array));

        String[] stringArray = {"hey", "yo", "sup", "hello", "a"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        Comparator<String> lengthComp = ((a, b) ->
                a.length() - b.length()
                    );
        bubbleSort(stringArray, 0, 4, lengthComp);
        System.out.println("comparing by length with just bubbleSort method: "
                           + Arrays.toString(stringArray));


    } // main

    /**
     * Bubble helper method for bubble sort.
     *
     * @param <T>
     * @param array
     * @param lo
     * @param hi
     * @param c
     */
    public static <T> void bubble(T[] array, int lo, int hi, Comparator<T> c) {

        for (int i = lo; i < hi; i++) {
            if (c.compare(array[i], array[i + 1]) > 0) {
                T temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            } // if

        } // for

    } // bubble

    /** bubbleSort method.
     *
     * @param <T>
     * @param array
     * @param lo
     * @param hi
     * @param c
     */

    public static <T> void bubbleSort(T[] array, int lo, int hi, Comparator<T> c) {
        for (int i = lo; i <= hi; i++) {
            bubble(array, lo, hi, c);
        } // for
    }

} // BubbleSort
