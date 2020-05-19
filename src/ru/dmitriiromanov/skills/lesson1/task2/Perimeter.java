package ru.dmitriiromanov.skills.lesson1.task2;

import java.util.Scanner;

/**
 * Для выполнения задания значения всех переменных вводятся с клавиатуры.
 * Даны длины катетов прямоугольного треугольника. Вычислить его периметр.
 */
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Длинна первого катета: ");
        int a = sc.nextInt();
        System.out.print("Длинна второго катета: ");
        int b = sc.nextInt();
        double c = Math.sqrt(a * a + b * b);
        double perimeter = a + b + c;
        System.out.print("Периметр треугольника = " + perimeter);
    }
}
