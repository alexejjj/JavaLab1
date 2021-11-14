//Задание номер 1 со сравнением чисел и выводом наименьшего из заданных.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println ("Введите первое число типа int: ");
        int i1;
        i1 = num.nextInt();
        System.out.println ("Введите второе число типа int: ");
        int i2;
        i2 = num.nextInt();
        System.out.println ("Введите третье число типа int: ");
        int i3;
        i3 = num.nextInt();
        System.out.println ("Введите четвёртое число число типа int: ");
        int i4;
        i4 = num.nextInt();
        if (i1 < i2 & i1 < i3 & i1 < i4) {
            System.out.print ("Наименьшее число из введённых: " + i1);
        }
        if (i2 < i1 & i2 < i3 & i2 < i4) {
            System.out.print ("Наименьшее число из введённых: " + i2);
        }
        if (i3 < i1 & i3 < i2 & i3 < i4) {
            System.out.print ("Наименьшее число из введённых: " + i3);
        }
        if (i4 < i1 & i4 < i2 & i4 < i3) {
            System.out.print ("Наименьшее число из введённых: " + i4);
        }
        if (i1 == i2 & i2 == i3 & i3 == i4) {
            System.out.print ("Не удаётся вывести наименьшее число, так как все введённые числа равны");
        }
    }
}
