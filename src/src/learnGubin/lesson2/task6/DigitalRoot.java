package src.learnGubin.lesson2.task6;

import java.util.Scanner;

/**
 * Составить программу нахождения цифрового корня натурального числа.
 * Цифровой корень данного числа получается следующим образом.
 * Если сложить все цифры этого числа, затем все цифры найденной суммы и повторять этот процесс,
 * то в результате будет получено однозначное число (цифра), которая и называется цифровым корнем данного числа.
 */
public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        if(number > 9) System.out.print("Цифровой корень числа = " + digitalRoot(number));
        else System.out.print("Цифровой корень числа = " + number);
    }
    static int digitalRoot(int inputNumber){
        int root = 0;
        while (inputNumber > 0) {
            root += inputNumber % 10;
            inputNumber /= 10;
        }
        if(root > 9) root = digitalRoot(root);
        return root;
        //return (inputNumber != 0 && inputNumber%9 == 0) ? 9 : inputNumber % 9;
    }
}
