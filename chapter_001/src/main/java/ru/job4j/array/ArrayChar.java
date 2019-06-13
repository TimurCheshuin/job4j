package ru.job4j.array;

/**
 * Обертка над строкой.
 */

public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */

    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        int index = 0;
        while (index < pref.length) {
            if (wrd[index] == pref[index]) {
                index++;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}