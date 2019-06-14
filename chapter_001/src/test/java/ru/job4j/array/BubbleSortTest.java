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

public class BubbleSortTest {

    /**
     * Test sort.
     */

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sortArray = new BubbleSort();
        int[] arraySort = {7, 3, 9, 0, 4, 5, 2, 8, 1, 6};
        int[] result = sortArray.sort(arraySort);
        assertThat(result, is(
                new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        ));
    }
}