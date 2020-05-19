package ru.dmitriiromanov.skills.lesson8_Exception.login;

/**
 * Сделать метод для валидации логина пользователя.
 * Логин пользователя должен быть не меньше 6 символов и не более 10 символов,
 * должен содержать хотя бы один символ в верхнем регистре.
 * Так же должен быть создан свой класс унаследованный от Exception,
 * который будет использоваться в методе для генерации ошибок если логин не прошёл валидацию и указывать причину.
 */
public class Login {
    public static void main(String[] args) {
        getLogin("rty");
    }

    static void getLogin(String login) {
        try {
            if (login.length() < 6 || login.length() > 10) {
                throw new MyException("error login");
            }
            char[] symbolArr = login.toCharArray();
            boolean flag = false;
            for (int i = 0; i < symbolArr.length; i++) {
                if (Character.isUpperCase(symbolArr[i])) {
                    flag = true;
                } else {
                    throw new MyException("error login, not Upper symbol");
                }

            }

            System.out.println(login);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}
