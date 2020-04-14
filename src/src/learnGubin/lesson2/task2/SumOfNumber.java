package src.learnGubin.lesson2.task2;

import java.util.Scanner;

/**
 * Найти все числа от 1 до N, которые не кратны 5 и кратны 3, и сумма цифр которых также не кратные 5и кратна 3 .
 */
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите величину массива: ");
        int valueArr = sc.nextInt();
        int[] arr = new int[valueArr];
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
        }
        int sumNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 != 0 && arr[i] % 3 == 0 &&
                    ((arr[i] / 10) + (arr[i] % 10)) % 5 != 0 && ((arr[i] / 10) + (arr[i] % 10)) % 3 == 0) {
                System.out.print(arr[i] + " ");
                sumNumber += arr[i];
            }
        }
        System.out.println();
        System.out.println("Сумма цифр = " + sumNumber);
    }
}
