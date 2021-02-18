package less_6_ifelse.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 18 февраль 2021
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа a: ");
        int a = scanner.nextInt();
        System.out.println("Введите числа b: ");
        int b = scanner.nextInt();
        System.out.println("Введите результат двух чисел ");
        int itog = scanner.nextInt();

        if (itog == a * b) {
            System.out.println("Да, правильный ответ ");
        } else {
            System.out.println("Неверно, правильно будет " + a * b);
        }
    }
}
