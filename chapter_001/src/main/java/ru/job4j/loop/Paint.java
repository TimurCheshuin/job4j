package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class Paint draws a pyramid.
 * @author Timur Cheshuin
 * @version 1
 * @since 10.06.19
 */

public class Paint {

    /**
     * Method rightTrl
     * @param height
     * @return right side of the pyramid.
     */

    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }


    /**
     * Method leftTrl
     * @param height
     * @return left side of the pyramid.
     */

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Method pyramid
     * @param height
     * @return the whole pyramid.
     */

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Method loopBy
     * @param height
     * @param widht
     * @param predict
     * @return
     */

    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

}