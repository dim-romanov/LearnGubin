package src.learnGubin.lesson2.task1;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два числа.
 * Определить, что больше, сумма квадратов или квадрат суммы этих чисел. Ответ вывести в виде сообщения.
 */
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numberOne = sc.nextInt();
        System.out.print("Введите второе число: ");
        int numberTwo = sc.nextInt();
        if (((numberOne * numberOne) + (numberTwo * numberTwo)) > ((numberOne + numberTwo) * (numberOne + numberTwo))) {
            System.out.println("Сумма квадратов больше");
        } else {
            System.out.println("Квадрат суммы больше");
        }
    }
}
