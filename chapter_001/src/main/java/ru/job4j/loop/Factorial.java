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
     * @param number positive integer.
     * @return the factorial of a number n.
     */
    public int calculate(int number) {
        int result = 1;
        if (number > 0) {
            for (int index = 1; index <= number; index++) {
                result *= index;
            }
        }
        return result;
    }
}