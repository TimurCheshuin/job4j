package ru.job4j.loop;

/**
 * The Class for calculating the factorial.
 * @author Timur Cheshuin
 * @since 08.06.19
 * @version 1
 */

public class Factorial {

    /**
     * Method calc.
     * @param n positive integer.
     * @return the factorial of a number n.
     */

    public int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}