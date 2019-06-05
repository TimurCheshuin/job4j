package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Test
 * @author Timur Cheshuin
 * @since 05.06.19
 * @version 1
 */

public class SqAreaTest {

    /**
     * Test square
     */

    @Test
    public void p4k1s1() {
        assertThat(new SqArea().square(4, 1), is(1));
    }

    /**
     * Test square
     */

    @Test
    public void p6k2s2() {
        assertThat(new SqArea().square(6, 2), is(2));
    }
}