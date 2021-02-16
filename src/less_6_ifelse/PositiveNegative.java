package less_6_ifelse;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/16/2021 Feb 2021
 */
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки положительного, отрицательного или ноль: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Положительный");
        } else if (number < 0) {
            System.out.println("Отрицательный");
        } else {
            System.out.println("Ноль");
        }
    }
}
