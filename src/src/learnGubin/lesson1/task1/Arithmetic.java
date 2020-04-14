package src.learnGubin.lesson1.task1;

import java.util.Scanner;
/**
 * Для выполнения задания значения всех переменных вводятся с клавиатуры.
 * Даны два действительных числа a и b. Вычислить их сумму, разность, произведение и частное.
 */
public class Arithmetic {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: " );
        double a = sc.nextDouble();
        System.out.print("Введите второе число: " );
        int b = sc.nextInt();
        System.out.println("Сумма чисел = " + (a + b));
        System.out.println("Разность чисел = " + (a - b));
        System.out.println("Произведение чисел = " + (a * b));
        System.out.println("Частное чисел = " + (a / b));
    }
}
