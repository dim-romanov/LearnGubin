package ru.dmitriiromanov.skills.lesson7_Strings.task1;

/**
 * Напишите программу, которая создает строку обратной к заданной строке
 */
public class ReturnLine {
    public static void main(String[] args) {
        String str = "Привет Мир";
        System.out.println(reversLine(str));
    }
    static String reversLine(String string){
        StringBuilder revers = new StringBuilder(string);
        return String.valueOf(revers.reverse());
    }
}
