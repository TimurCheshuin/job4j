package ru.job4j.array;

/**
 * Class Square calculates the square of each array element.
 * @author Timur Cheshuin
 * @since 12.06.19
 * @version 1
 */

public class Square {

    /**
     * Method calculate.
     * @param bound
     * @return array of squares
     */

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for(int index = 0; index < bound; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}
