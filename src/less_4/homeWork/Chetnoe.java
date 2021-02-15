package less_4.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 05 Feb 2021
 */
public class Chetnoe {
    public static void main(String[] args) {
        System.out.println("Проверять является ли четным: \n ");
        Scanner scanChetnoe = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = scanChetnoe.nextInt();

        boolean res = numb %2 == 0;
        System.out.println("Результат: " + res);
    }
}
