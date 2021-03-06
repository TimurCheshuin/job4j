package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 12.06.19
 * @version 1
 */


public class FindLoopTest {

    /**
     * Test indexOf
     */

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Test indexOf
     */

    @Test
    public void whenArrayHas11Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {7, 2, 85, 11, 18};
        int value = 11;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Test indexOf
     */

    @Test
    public void whenArrayHasNot() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {9, 12, 20, 56};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}