// Задача с факториалом
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Введите неотрицательное число не превышающее 14: ");
        int num;
        num = in.nextInt();
        if (num < 0 | num > 14) {
            System.out.print ("Введённое число не соответствует интервалу {0, 14}. Ошибка.");
            return;
        }
        if (num == 0) {
            System.out.print ("Факториал введённого числа равен 1");
            return;
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("Факториал введённого числа равен: " + result);

    }
}