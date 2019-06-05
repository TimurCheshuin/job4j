package ru.job4j.condition;

/**
 * Class Point calculating the distance between points in the coordinate system.
 * @author Timur Cheshuin
 * @since 05.06.19
 * @version 1
 */

public class Point {

    /**
     * Method distance.
     * @param x1, y1, x2, y2. Point coordinates.
     * @return the distance between points.
     */

    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}