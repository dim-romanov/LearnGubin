package src.learnGubin.lesson7Strings.someString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */
public class SomeString {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите количество строк: ");
            int countString = Integer.parseInt(reader.readLine());
            String[] arrString = new String[countString];
            for (int i = 0; i < countString; i++) {
                System.out.print("Введите строку: ");
                arrString[i] = reader.readLine();
            }

            Arrays.sort(arrString, (str1, str2) -> str1.length() - str2.length());
            System.out.println(arrString[0] + " длинна строки = " + arrString[0].length());
            System.out.println(arrString[arrString.length - 1] + " длинна строки = " + arrString[arrString.length - 1].length());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Вы допустили ошибку");
        }
    }
}
