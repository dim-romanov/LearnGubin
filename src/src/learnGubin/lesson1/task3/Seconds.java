package src.learnGubin.lesson1.task3;

import java.util.Scanner;

/**
 * Для выполнения задания значения всех переменных вводятся с клавиатуры.
 * Даны длины катетов прямоугольного треугольника. Вычислить его периметр.
 */
public class Seconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество часов: ");
        int hours = sc.nextInt();
        System.out.print("Количество минут: ");
        int minutes = sc.nextInt();
        System.out.print("Количество секунд: ");
        int seconds = sc.nextInt();
        System.out.print("Количество минут с начала суток = " + (hours * 3600 + minutes * 60 + seconds));
    }
}
