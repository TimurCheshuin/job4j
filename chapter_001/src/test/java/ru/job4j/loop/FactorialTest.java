package ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test
 * @author Timur Cheshuin
 * @since 08.06.19
 * @version 1
 */
public class FactorialTest {
    /**
     * Test calculate.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial fact = new Factorial();
        int result = fact.calculate(5);
        assertThat(result, is(120));
    }
    /**
     * Test calculate.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fact = new Factorial();
        int result = fact.calculate(0);
        assertThat(result, is(1));
    }
}