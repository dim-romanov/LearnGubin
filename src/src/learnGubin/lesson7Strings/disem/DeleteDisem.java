package src.learnGubin.lesson7Strings.disem;

public class DeleteDisem {
    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
        System.out.println(1234%10);
    }
}

class Troll {
    public static String disemvowel(String str) {
        // Code away...
        /*String[] symbols = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (int i = 0; i < symbols.length; i++) {
            str = str.replaceAll(symbols[i] , "");
        }*/
        return str.replaceAll("(?i)[aeiou]" , "");
    }
}
