package ru.dmitriiromanov.skills.lesson2.task7;

import java.util.Scanner;

/**
 * Натуральное число называется палиндромом, если он одинаково читается с обеих сторон (9532359).
 * Возьмем любое число, если оно не палиндром, то перевернем его и сложим с исходным, и так до тех пор,
 * пока не получим палиндром.
 * Для любого заданного числа определить число шагов до получения палиндрома.
 */
public class Palindrome {
    public static void main(String[] args) {
        String str;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int number = in.nextInt();
        while(!isPalindrome(Integer.toString(number)))
        {
            str = new StringBuffer(Integer.toString(number)).reverse().toString();
            number += Integer.parseInt(str);
            count++;
        }
        System.out.println("Число палиндром " + number);
        System.out.print("Количество итераций " + count);
    }

    private static boolean isPalindrome(String src) {
        boolean palindrome = true;
        for (int i = 0; i < src.length() / 2; i++) {
            if (src.charAt(i) != src.charAt(src.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

}
