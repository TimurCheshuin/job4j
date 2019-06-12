package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 12.06.19
 * @version 1
 */

public class TurnTest {

    /**
     * Test back.
     */

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /**
     * Test back.
     */


    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = {5, 8, 10, 17, 21};
        int[] result = turner.back(input);
        int[] expect = {21, 17, 10, 8, 5};
        assertThat(result, is(expect));
    }
}