package ru.job4j.condition;

/**
 * Class Max.
 * @author Timur Cheshuin
 * @since 06.06.19
 * @version 1
 */

public class Max {

    /**
     * Method max.
     * @param left, right. Two numbers.
     * @return max value number.
     */

    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}