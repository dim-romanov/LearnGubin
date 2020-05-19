package ru.dmitriiromanov.skills.lesson1.task5;

import java.util.Scanner;

/**
 * Для выполнения задания значения всех переменных вводятся с клавиатуры.
 * Дано целое число.Определить в нем количество сотен (не включающее количество тысяч).
 * Например для числа 1234 количество сотен равно 2.
 */
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        int hundred = (number % 1000) / 100;
        System.out.println("Количество сотен = " + hundred);
    }
}
