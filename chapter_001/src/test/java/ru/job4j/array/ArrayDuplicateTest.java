package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 15.06.19
 * @version 1
 */

public class ArrayDuplicateTest {

    /**
     * Test remove.
     */

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate dublicate = new ArrayDuplicate();
        String[] input = {"morning", "Good", "Good", "my", "morning", "Dear"};
        String[] result = dublicate.remove(input);
        assertThat(result, is(
                new String[]{"morning", "Good", "Dear", "my"}
        ));
    }
}