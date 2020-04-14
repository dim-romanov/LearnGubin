package src.learnGubin.lesson7.task3;

/**
 * Напишите программу, которая для строки выводит количество слов,
 * прописных букв, строчных букв, знаков препинания и цифр
 */
public class Statistics {
    public static void main(String[] args) {
        String str = "hello, World123., qwerty   Abcde";
        statistics(str);
    }
    static void statistics(String s){
        char[]arrChar = s.toCharArray();
        int countWord = s.split(" +").length;
        int countUpLetter = 0;
        int countDownLetter = 0;
        int countNumber = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if(Character.isUpperCase(arrChar[i])) countUpLetter++;
            if(Character.isLowerCase (arrChar[i])) countDownLetter++;
            if(!Character.isLetter(arrChar[i]) && !Character.isWhitespace(arrChar[i])) countNumber++;
        }
        System.out.println("Количество слов = " + countWord);
        System.out.println("Прописных букв = " + countUpLetter);
        System.out.println("Строчных букв = " + countDownLetter);
        System.out.println("Знаков препинания и цифр = " + countNumber);

    }
}
