package cs1302.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Quicksort class for sorting arrays.
 */
public class QuickSort {


    public static void main(String[] args) {

        Integer[] array = {1, 3, 2, 4, 5};

        System.out.println("Original Integer array: " + Arrays.toString(array));
        quickSort(array, 0, 4, Integer::compareTo);
        System.out.println("Lo = 0");
        System.out.println("Hi = 4");
        System.out.println("After quickSort call: " + Arrays.toString(array));


        String[] arrayString = {"hello", "world", "hey", "corona", "virus", "ahhh"};

        System.out.println("Original String array: " + Arrays.toString(arrayString));
        quickSort(arrayString, 0, 5, String::compareTo);
        System.out.println("lo = 0");
        System.out.println("hi = 5");
        System.out.println("after quickSort call: " + Arrays.toString(arrayString));

    } // main


    /**
     * Partition method.
     *
     * @param array array to be sorted.
     * @param lo the low integer
     * @param pivot the pivot integer
     * @param hi the high integer
     * @param c the comparator
     * @param <T> the type
     * @return int new pivot
     */
    public static <T> int partition(T[] array, int lo, int pivot, int hi, Comparator<T> c) {


        T temp = array[pivot];
        array[pivot] = array[hi];
        array[hi] = temp;
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (c.compare(array[j], array[hi]) < 0) {
                T temp1 = array[j];
                array[j] = array[i];
                array[i] = temp1;
                i++;
            } // if
        } // for
        T temp2 = array[i];
        array[i] = array[hi];
        array[hi] = temp2;
        return i;

    } // partition


    /** quickSort method.
     *
     * @param array
     * @param lo
     * @param hi
     * @param c
     * @param <T>
     */

    public static <T> void quickSort(T[] array, int lo, int hi, Comparator<T> c) {

        int pivot = hi / 2 + lo / 2;
        for (int i = lo; i < hi; i++) {
            partition(array, lo, pivot, hi, c);
        } //for

    } //quickSort

} // quicksort
