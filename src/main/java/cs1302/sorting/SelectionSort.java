package cs1302.sorting;


import java.util.Comparator;
import java.util.Arrays;

/**
 * Select Sort class.
 */

public class SelectionSort {

    public static void main(String[] args) {

        Integer[] array = {2, 3, 1, 4, 5};

        System.out.println("The array before sorting: " + Arrays.toString(array));
        selectionSort(array, 0, 4, Integer::compareTo);
        System.out.println("lo = 0, hi = 4");
        System.out.println("The array finding smallest int" +
                           "and putting it in first place after calling selectionSort"
                           + Arrays.toString(array));

        String[] arrayString = {"who", "what", "how", "why"};

        System.out.println("The array before sorting: " + Arrays.toString(arrayString));
        selectionSort(arrayString, 0, 3, String::compareTo);
        System.out.println("lo = 0, hi = 3");
        System.out.println("The array finding the first" +
                           "string lexocographically after calling selectionSort" +
                           Arrays.toString(arrayString));

    } // main

    /**
     * Selects the min.
     *
     * @param array the array to sort
     * @param lo the low int
     * @param hi the high int
     * @param c the comparator
     * @param <T> the type to be sorting
     */
    public static <T> void selectMin(T[] array, int lo, int hi, Comparator<T> c) {

        for (int i = lo; i < hi; i++) {
            if (c.compare(array[lo], array[i + 1]) > 0) {
                T temp = array[i + 1];
                array[i + 1] = array[lo];
                array[lo] = temp;
            } // if

        } // for

    } //selectMin

    /** Sorts by selection sort.
     *
     * @param array the array to sort
     * @param lo the low int
     * @param hi the high int
     * @param c the comparator
     * @param <T> the type to be sorting
     */

    public static <T> void selectionSort(T[] array, int lo, int hi, Comparator<T> c) {

        for (int i = lo; i < hi; i++) {
            selectMin(array, i, hi, c);
        }

    } // selectionSort

} // SelectionSort
