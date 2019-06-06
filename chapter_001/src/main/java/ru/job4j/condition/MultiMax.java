package ru.job4j.condition;

/**
 * Class MultiMax defines the maximum of the three numbers.
 * @author Timur Cheshuin
 * @since 06.06.19
 * @version 1
 */

public class MultiMax {

    /**
     * Method max.
     * @param first, second, third. The numbers.
     * @return the maximum of the three numbers.
     */

    public int max(int first, int second, int third) {
        int maxOfTwoNum = first > second ? first : second;
        int result = maxOfTwoNum > third ? maxOfTwoNum : third;
        return result;
    }
}