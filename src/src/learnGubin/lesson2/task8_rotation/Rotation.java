package src.learnGubin.lesson2.task8_rotation;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = scanner.nextLine().split(" ");
        int number  = scanner.nextInt();
        for (int n = 0; n < number; n++) {
            // убираем первый элемент в буфер, а на его место ставим хвостовой элемент
            String buffer = arr[0];
            arr[0] = arr[arr.length - 1];
            // циклично сдвигаем весь массив
            for (int j = 1; j < arr.length - 1; j++) {
                arr[arr.length - j] = arr[arr.length - j - 1];
            }
            // ставим буферный элемент в 1 ячейку
            arr[1] = buffer;
            System.out.println(Arrays.toString(arr));
        }
    }
}

