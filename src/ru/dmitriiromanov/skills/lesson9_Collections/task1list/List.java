package ru.dmitriiromanov.skills.lesson9_Collections.task1list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Создать линейный однонаправленный список из 100 целых чисел в диапазоне от 0 до 100.
 * Определить сумму элементов списка со значениями больше либо равными 15.
 * Удалить из списка все значения, которые меньше 5.
 * Вставить в список число 11 после каждого элемента, равного 9.
 * Определить среднеарифметическое правой части списка
 * Удалить из списка последний элемент со значением меньшим 15.
 */
public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        int count = 0;
        for (Integer integer : list) {
            if (integer >= 15) {
                count += integer;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.removeIf(e -> e < 5);
        }
        list.add(list.indexOf(9) + 1, 11);


        System.out.println(count);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
    }
}
