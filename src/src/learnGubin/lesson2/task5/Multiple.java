package src.learnGubin.lesson2.task5;

import java.util.Scanner;

/**
 * Найти все числа кратные пяти для чисел от 1 до N.
 */
public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int sizeArr = sc.nextInt();
        int[]arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            if (arr[i] % 5 == 0) System.out.print(arr[i] + " ");
        }
    }
}
