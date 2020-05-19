package ru.dmitriiromanov.skills.lesson7_Strings.task2;

/**
 * Напишите программу, которая принимает строку и удаляет из этой строки все пробелы.
 */
public class NotSpace {
    public static void main(String[] args) {
        String str = "hello world !";
        System.out.println(notSpace(str));
    }
    static String notSpace(String s) {
       return s.replaceAll(" ", "");
    }
}
