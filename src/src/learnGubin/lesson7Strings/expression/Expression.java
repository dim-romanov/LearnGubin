package src.learnGubin.lesson7Strings.expression;

/**
 * Напишите программу, которая получает строку вида «123+74854-45+12» и находит решение для выражения
 */
public class Expression {
    public static void main(String[] args) {
        String str = "123+74854-45+12";
        expressionResult(str);

    }

    static int expressionResult(String expression) {
        int resultExpression = 0;
        String[] symbols = expression
                .replaceAll(" ","")
                .split("[\\d]");
        String[] tokens = expression
                .replaceAll(" ","")
                .split("\\+|-|\\*|/");
        if (tokens.length >= 1) {
            resultExpression += Integer.parseInt(tokens[0]);
            for (int i = 0, j = 1; i < symbols.length; i++) {
                if (!symbols[i].isEmpty()) {
                    if (symbols[i].equals("+")) {
                        resultExpression += Integer.parseInt(tokens[j]);
                    }
                    if (symbols[i].equals("-")) {
                        resultExpression -= Integer.parseInt(tokens[j]);
                    }
                    j++;
                }
            }
        }
        System.out.println(resultExpression);
        return resultExpression;
    }
}
