package ru.dmitriiromanov.skills.lesson1.task4;

import java.util.Scanner;

/**
 * Для выполнения задания значения всех переменных вводятся с клавиатуры.
 * Дано количество секунд с начала суток. Вычислить текущее время.
 */
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int number = sc.nextInt();
        int hours = number / 3600;
        int minutes = (number % 3600) / 60;
        int seconds = ((number % 3600) % 60);
        System.out.println("Количество часов " + hours + " минут " + minutes + " секунд " + seconds);
    }
}
