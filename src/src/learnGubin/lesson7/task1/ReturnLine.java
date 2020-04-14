package src.learnGubin.lesson7.task1;

/**
 * Напишите программу, которая создает строку обратной к заданной строке
 */
public class ReturnLine {
    public static void main(String[] args) {
        String str = "Привет Мир";
        System.out.println(reversLine(str));
    }
    static String reversLine(String s){
        StringBuilder reversL = new StringBuilder(s);
        return String.valueOf(reversL.reverse());
    }
}
