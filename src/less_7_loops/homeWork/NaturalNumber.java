package less_7_loops.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральные числа: ");
        int chisloA = scanner.nextInt();
        int max = 0;
        if (chisloA != 0) {
            while (chisloA > 0) {
                if (chisloA % 10 > max) max = chisloA % 10;
                chisloA /= 10;
            }
            System.out.println("Наибольшей цифрой является " + max);
        } else {
            System.out.println("Заданное число не является натуральным");
            System.out.println("Попробуйте еще раз.");
        }
    }
}
