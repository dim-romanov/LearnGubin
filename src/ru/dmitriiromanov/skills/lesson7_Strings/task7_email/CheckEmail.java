package ru.dmitriiromanov.skills.lesson7_Strings.task7_email;

/**
 * Написать регулярное выражение, которые проверят емейлы простого вида (например, test@test.test).
 */

public class CheckEmail {
    public static void main(String[] args) {
        String email = "test@test.test";
        System.out.println(getCheckEmail(email));
    }

    public static boolean getCheckEmail(String str) {
        return str.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
    }
}
