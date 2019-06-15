package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDublicate removes duplicate items.
 * @author Timur Cheshuin
 * @since 15.06.19
 * @version 1
 */

public class ArrayDuplicate {

    /**
     * Method remove.
     * @param array
     * @return array without duplicates
     */

    public String[] remove(String[] array) {
        String change;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    change = array[j];
                    array[j] = array[size - 1];
                    array[size - 1] = change;
                    size--;
                }
            }
        }
        String[] newArray = Arrays.copyOf(array, size);
        return newArray;
    }
}
