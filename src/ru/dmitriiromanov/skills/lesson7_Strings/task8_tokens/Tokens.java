package ru.dmitriiromanov.skills.lesson7_Strings.task8_tokens;

/**
 * Разбить предложение на токены. Это может быть полезно, например, для поисковой системы.
 * Есть несколько правил:Несколько слов в кавычках должны попасть в один токен
 * This "huge test" is pointless => this,huge test,is,pointless
 * Слова написанные через дефис так же попадают в один токен.
 * Слова написанные через несколько дефисов (тире), или имеющие дефис в начале или в конце
 * попадают в раздельные токены.
 * Suzie Smith-Hopper test--hyphens => Suzie,Smith-Hopper,test,hyphens.
 * Сокращения (стяжения) попадают в один токенI can't do it => I,can't,do,it.
 * Вся пунктуация кроме апострофов и дефисов должна быть убрана.
 * Too long; didn't read => Too,long,didn't,read.
 */

public class Tokens {
    public static void main(String[] args) {
        String string = "This \"huge test\" is pointless => this,huge test,is,pointless";
    }
    public static void createTokens(String str) {
        String [] listTokens = str.split(" ");
        //char[] arrSymbols = str.toCharArray();
        String tok = "";
        for (String token : listTokens) {
            if (token.matches("([\"']?\\w+)")) {
                tok = token;
                /*while (token.matches("\\w+[\"']?")) {

                }*/
            }
        }

    }
}
