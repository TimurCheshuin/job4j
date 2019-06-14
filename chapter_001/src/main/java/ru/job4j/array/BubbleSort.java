package ru.job4j.array;

/**
 * Class BubbleSort sorts items in ascending order.
 * @author Timur Cheshuin
 * @since 14.06.19
 * @version 1
 */

public class BubbleSort {

    /**
     * Method sort.
     * @param array
     * @return sorted array.
     */

    public int[] sort(int[] array) {
        int change = 0;
        for (int i = 0; i < array.length; i++) {
            for (int index = 1; index < array.length; index++) {
                if (array[index] < array[index - 1]) {
                    change = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = change;
                }
            }
        }
        return array;
    }
}