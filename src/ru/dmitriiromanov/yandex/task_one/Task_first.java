package ru.dmitriiromanov.yandex.task_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/** input strings:              output strings:
 * a abb bab abc                a
 * 6                            abb
 * q                            bab
 * bcc                          abc
 * aza                          a
 * abc                          abc
 * z
 * def
 */
public class Task_first {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split(" ");
        int count = Integer.parseInt(reader.readLine());
        String[] arrWord = new String[count];
        for (int i = 0; i < count; i++) {
            arrWord[i] = reader.readLine();
        }

        System.out.println(Arrays.toString(arrWord));
        //System.out.println(getNewString(new char[]{'a','b','c','d'}, shift));
        for (int i = 0; i < arrWord.length; i++) {
            int j = 0;
            int shift = 0;
            while (j <= tokens.length - 1) {
                if (shift < 26) {
                    String testStr = getNewString(arrWord[i].toCharArray(), shift);
                    if (!tokens[j].equals(testStr)) {
                        shift++;

                    } else {
                        System.out.println(tokens[j]);
                        break;
                    }
                } else {
                    j++;
                    shift = 0;
                }
            }
        }
    }

    static String getNewString(char[] chars, int count) {
        char[] shiftString = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            shiftString[i] = getSymbol(chars[i], count);
        }
        return new String(shiftString);
    }

    static char getSymbol(char symbol, int shift) {
        char newSymbol = 0;
        char[] symbolArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'z', 'y', 'z'};
        for (int i = 0; i < symbolArr.length; i++) {
            if (symbol == symbolArr[i]) {
                if ((symbolArr.length - 1) - i >= shift) {
                    newSymbol = symbolArr[i + shift];
                } else {
                    int count = shift - ((symbolArr.length - 1) - i);
                    newSymbol = symbolArr[count - 1];
                }
            }
        }
        return newSymbol;
    }
}

