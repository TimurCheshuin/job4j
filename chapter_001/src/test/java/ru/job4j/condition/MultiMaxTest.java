package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 06.06.19
 * @version 1
 */

public class MultiMaxTest {

    /**
     * Test MultiMax
     */

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test MultiMax
     */

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 1, 5);
        assertThat(result, is(7));
    }

    /**
     * Test MultiMax
     */

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 6, 9);
        assertThat(result, is(9));
    }

    /**
     * Test MultiMax
     */

    @Test
    public void whenSame() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 7, 7);
        assertThat(result, is(7));
    }
}