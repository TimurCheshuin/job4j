package ru.job4j.loop;

/**
 * Class Border generates a Board as a string without output to the console.
 * @author Timur Cheshuin
 * @since 10.06.19
 * @version 1
 */

public class Board {

    /**
     * Method paint.
     * @param width
     * @param height
     * @return string object.
     */

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (((j + i) % 2) == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}