package ru.dmitriiromanov.skills.lesson8_Exception.del;

/**
 * Написать метод, в который передаются 2 числа, а возвращает он результат деления первого числа на второе.
 * Созданный метод должен порождать исключение деление на ноль.
 */
public class Delete {
    public static void main(String[] args) {
        divide(10, 2);
        divide(10, 0);
    }
    static void divide(int numberOne, int numberTwo) {
        try {
            System.out.println(numberOne / numberTwo);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
