package ru.dmitriiromanov.skills.lesson7_Strings.compression;

import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new String(sc.nextLine()).toCharArray();
        int count = 1;
        if (chars.length == 1) System.out.print(chars[0] + "" + count);
        if (chars.length > 1) {
            for (int i = 1; i < chars.length; i++) {
                if (chars[i - 1] == chars[i]) {
                    count += 1;
                } else {
                    System.out.print(chars[i-1] + "" + count);
                    count = 1;
                }
                if (i == chars.length - 1) {
                    System.out.print(chars[i] + "" + count);
                }
            }
        }
    }
}
