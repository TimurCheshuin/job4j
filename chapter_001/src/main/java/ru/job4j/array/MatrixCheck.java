package ru.job4j.array;

/**
 * Class MatrixCheck compares the elements on the diagonal.
 * @author Timur Cheshuin
 * @since 13.06.19
 * @version 1
 */

public class MatrixCheck {

    /**
     * Method mono
     *
     * @param data
     * @return result.
     */

    public boolean mono(boolean[][] data) {
        boolean result = true;
        int size = data.length;
        for (int i = 1; i < size; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
            if (data[0][size - 1] != data[i][size - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}