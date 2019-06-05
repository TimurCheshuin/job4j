package ru.job4j.condition;

/**
 * Class SqArea .
 * @author Timur Cheshuin
 * @since 05.06.19
 * @version 1
 */

public class SqArea {

    /**
     * Method distance calculates the area of square.
     * @param p, k.
     * @return the area of square.
     */

    public int square(int p, int k) {
        int height = p / (2 * (k + 1));
        int lenght = height * k;
        return height * lenght;
    }
}