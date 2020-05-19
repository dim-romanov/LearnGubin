package ru.dmitriiromanov.skills.lesson7_Strings.whoLikesIt;

public class Likes {
    public static void main(String[] args) {
        System.out.println(Solution.whoLikesIt("Peter", "Masha", "Dima"));
    }
}
class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return names[0] + " likes this";
            case 2: return names[0] + " and " + names[1] + " like this";
            case 3: return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default: return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}