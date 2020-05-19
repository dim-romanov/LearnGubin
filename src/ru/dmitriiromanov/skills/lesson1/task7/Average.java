package ru.dmitriiromanov.skills.lesson1.task7;

import java.util.Scanner;

/**
 * Для выполнения задания значения всех переменных вводятся с клавиатуры.Возраст Тани — X лет, а возраст Мити — Y лет.
 * Найти их средний возраст, а также определить, на сколько отличается возраст каждого ребенка от средне-го значения.
 */
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Возраст Тани: ");
        double ageTanya = sc.nextDouble();
        System.out.print("Возраст Мити: ");
        double ageMitya = sc.nextDouble();
        double averageAge = (ageTanya + ageMitya) / 2;
        System.out.println("Средний возраст = " + averageAge);
        System.out.println("Возраст Тани отличается на  = " + Math.abs(averageAge - ageTanya));
        System.out.println("Возраст Мити отличается на  = " + Math.abs(averageAge - ageMitya));
    }
}
