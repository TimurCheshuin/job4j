package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 03.06.19
 * @version 1
 */

public class CalculatorTest  {

    /**
     * Test add.
     */

    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test subtract.
     */

    @Test
    public void whenSubThreeMinusTwoThenOne()  {
        Calculator calc = new Calculator();
        double result = calc.subtract(3D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test div.
     */

    @Test
    public void whenDivFourOnTwoThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.div(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test multiple.
     */

    @Test
    public void whenMultTwoOnThreeThenSix()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 3D);
        double expected = 6D;
        assertThat(result, is(expected));
    }
}