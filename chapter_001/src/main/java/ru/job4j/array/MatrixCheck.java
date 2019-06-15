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
        for (int i = 0; i < size; i++) {
            int j = i;
                if ((data[i][j] != data[size - 1 - i][size - 1 - j]) || (data[i][j] != data[size - 1][size - 1])) {
                    result = false;
                    break;
                }
        }
        return result;
    }
}