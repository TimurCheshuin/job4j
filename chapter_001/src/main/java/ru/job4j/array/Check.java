package ru.job4j.array;

/**
 * Class Check defines the equality of array elements.
 * @author Timur Cheshuin
 * @since 13.06.19
 * @version 1
 */

public class Check {

    /**
     * Method mono.
     * @param data - array.
     * @return the result of the equality test
     */

    public boolean mono(boolean[] data) {
        boolean result = false;
        int index = 1;
            while (index < data.length) {
                if (data[index] == data [index - 1]) {
                    result = true;
                    index++;
                }
                else {
                    result = false;
                    break;
                }
            }
        return result;
    }
}