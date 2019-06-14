package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 14.06.19
 * @version 1
 */

public class MatrixCheckTest {

    /**
     * Test mono.
     */

    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = {
                {false, true, true, true, false},
                {true, false, true, false, true},
                {true, true, false, true, true},
                {true, false, true, false, true},
                {false, true, true, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = {
                {false, true, true, true, false},
                {true, false, true, false, true},
                {true, true, true, true, true},
                {true, false, true, false, true},
                {false, true, true, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}