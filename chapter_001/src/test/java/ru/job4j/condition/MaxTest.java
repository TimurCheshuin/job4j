package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 06.06.19
 * @version 1
 */

public class MaxTest {

    /**
     * Test max value
     */

    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To1Then4() {
        Max max = new Max();
        int result = max.max(4, 1);
        assertThat(result, is(4));
    }
}