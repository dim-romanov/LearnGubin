package ru.dmitriiromanov.skills.lesson7_Strings.task6_onlyA;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать регулярное выражение, которые проверят строки на соответствие:
 * «a», «aaaaaa», «a aa a» (т.е. проверяемые строки должны состоять из символа «a»).
 */

public class Only {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("aaaaaa");
        list.add("a aa a");
        list.add("a aab a");

        for (String str : list) {
            System.out.println(getOnlyAString(str));
        }

    }
    public static boolean getOnlyAString(String str) {
        Pattern pattern = Pattern.compile("[b-z]");
        Matcher matcher = pattern.matcher(str);
        boolean foundA = matcher.find();
        return !foundA;
    }
}
