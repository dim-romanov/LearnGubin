package src.learnGubin.lesson7.task2;

import java.util.StringTokenizer;

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
