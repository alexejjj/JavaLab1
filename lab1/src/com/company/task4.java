//Задание со временами года
package com.company;

import java.util.Scanner;

public class task4{

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println ("Введите число месяца (1-12): ");
        int month;
        month = num.nextInt();
        if (month < 1 | month > 12) {
            System.out.print ("Введённое число не соответствует номеру месяца. Ошибка.");
        }
        if (month == 1 | month == 2 | month == 12) {
            System.out.print ("Введённый месяц относится ко времени года - зима");
        }
        if (month == 3 | month == 4 | month == 5) {
            System.out.print ("Введённый месяц относится ко времени года - весна");
        }
        if (month == 6 | month == 7 | month == 8) {
            System.out.print ("Введённый месяц относится ко времени года - лето");
        }
        if (month == 9 | month == 10 | month == 11) {
            System.out.print ("Введённый месяц относится ко времени года - осень");
        }
    }
}
