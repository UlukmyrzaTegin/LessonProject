package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Delenie {
    public static void main(String[] args) {
        System.out.println("Проверить делиться ли первое числа на второе без остатки: ");
        Scanner scanDelenie = new Scanner(System.in);
        System.out.println("Введите число первое");
        int chisloPervoe = scanDelenie.nextInt();
        System.out.println("Второе число равен к 2: ");

        System.out.println(chisloPervoe % 2 == 0);
    }
}
