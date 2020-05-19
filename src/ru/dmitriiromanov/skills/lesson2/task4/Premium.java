package ru.dmitriiromanov.skills.lesson2.task4;

import java.util.Scanner;

/**
 * Рассчитать надбавку к зарплате за стаж, если стаж от 2 до 5 лет,
 * надбавка составляет 2%, если стаж от 5 до 10 лет - 5%.
 * Ввести с клавиатуры зарплату и стаж, вывести надбавку и сумму к выплате
 */
public class Premium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите зарплату: ");
        double salary = sc.nextDouble();
        System.out.print("Укажите стаж: ");
        int experience = sc.nextInt();
        double premium = 0;
        if(experience >= 2 && experience < 5){
            premium = (salary / 100) * 2;
        } else if (experience >= 5 && experience <= 10) {
            premium = (salary / 100) * 5;
        }
        System.out.println("Надбавка составляет " + premium + ", \nСумма к выплате " + (salary + premium));
    }
}
