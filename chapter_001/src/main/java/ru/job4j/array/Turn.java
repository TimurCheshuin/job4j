package ru.job4j.array;

/**
 * Class Turn flips the array.
 * @author Timur Cheshuin
 * @since 12.06.19
 * @version 1
 */

public class Turn {

    /**
     * Method back.
     * @param array
     * @return Inverted array
     */

    public int[] back(int[] array) {
        int change;
        for (int index = 0; array.length > index; index++) {
            if (index < array.length / 2) {
                change = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = change;
            }
            }
        return array;
        }
    }