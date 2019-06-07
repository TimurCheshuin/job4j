package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 07.06.19
 * @version 1
 */

public class CounterTest {

    /**
     * Test add.
     */

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter count = new Counter();
        int result = count.add(3, 19);
        assertThat(result, is(88));
    }
}