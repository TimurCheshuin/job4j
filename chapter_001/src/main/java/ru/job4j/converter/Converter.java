package ru.job4j.converter;

/**
 * Корвертор валюты.
 * @author Timur Cheshuin
 * @since 28.05.19
 * @version 1
 */

public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */

    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */

    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */

    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */

    public int dollarToRuble(int value) {
        return value * 60;
    }
}