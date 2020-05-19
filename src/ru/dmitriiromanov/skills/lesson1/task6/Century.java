package ru.dmitriiromanov.skills.lesson1.task6;

import java.util.Scanner;

/**
 * Для выполнения задания значения всех переменных вводятся с клавиатуры.
 * Дан номер некоторого года (целое положительное число).
 * Определить соответствующий ему номер столетия, учитывая, что, к примеру, началом 20 столетия был 1901 год.
 */
public class Century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер года: ");
        int numberYear = sc.nextInt();
        int century = (numberYear / 100) + 1;
        System.out.println("Номер столетия = " + century);
    }
}
