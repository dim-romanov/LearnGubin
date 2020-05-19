package ru.dmitriiromanov.skills.lesson2.task3;

import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести четные и нечетные числа.
 */
public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int sizeArr = sc.nextInt();
        int[]arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                System.out.print(arr[i] + " ");
        }
    }
}
