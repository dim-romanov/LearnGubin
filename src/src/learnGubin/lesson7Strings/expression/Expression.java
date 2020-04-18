package src.learnGubin.lesson7Strings.expression;

/**
 * Напишите программу, которая получает строку вида «123+74854-45+12» и находит решение для выражения
 */
public class Expression {
    public static void main(String[] args) {
        String str = "10+5-10+3+ 12";
        expressionResult(str);

    }

    static int expressionResult(String s) {
        int countSum = 0;
        s = s.replaceAll(" ", "");
        char[] charsArr = s.toCharArray();
        char[] chars = new char[charsArr.length];
        for (int i = 0, j = 0; i < charsArr.length; i++) {
            if (charsArr[i] == '+' || charsArr[i] == '-') {
                chars[j] = charsArr[i];
                j++;
            }
        }
        String[] strings = s.split("\\+|-|\\*|/");
        if (strings.length >= 1) {
            countSum += Integer.parseInt(strings[0]);
            for (int i = 0, j = 1; i < chars.length; i++) {
                if (chars[i] == '+') {
                    countSum += Integer.parseInt(strings[j]);
                }
                if (chars[i] == '-') {
                    countSum -= Integer.parseInt(strings[j]);
                }
                j++;
            }
        }
        System.out.println(countSum);
        return countSum;
    }
}
