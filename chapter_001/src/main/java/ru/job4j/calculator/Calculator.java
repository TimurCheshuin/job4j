package ru.job4j.calculator;

/**
   * Class Calculator includes methods for performing elementary arithmetic calculations.
   * @author Timur Cheshuin
   * @since 03.06.19
   * @version 1
*/

public class Calculator {

    /**
     * Method add.
     * @param first, second. The numbers with which the calculation is performed.
     * @return The result of adding two numbers.
     */

    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method subtract.
     * @param first, second. The numbers with which the calculation is performed.
     * @return Difference of two numbers.
     */

    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Method div.
     * @param first, second. The numbers with which the calculation is performed.
     * @return The result of dividing one number by another.
     */

    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Method multiple.
     * @param first, second. The numbers with which the calculation is performed.
     * @return The result of multiplying one number by another.
     */

    public double multiple(double first, double second) {
        return first * second;
    }
}