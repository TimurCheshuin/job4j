package ru.job4j.loop;

/**
 * Class Counter calculates the sum of even numbers in the range.
 * @author Timur Cheshuin
 * @since 07.06.19
 * @version 1
 */

public class Counter {

    /**
     * Method add.
     * @param start, finish. Two numbers.
     * @return sum of even numbers.
     */

    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if ((i % 2) == 0) sum += i;
        }
        return sum;
    }
}