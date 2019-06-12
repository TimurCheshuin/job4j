package ru.job4j.array;

/**
 * Class FindLoop finds the desired element of the array.
 * @author Timur Cheshuin
 * @since 12.06.19
 * @version 1
 */

public class FindLoop {

    /**
     * Method indexOf.
     * @param data
     * @param el
     * @return search index.
     */

    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}