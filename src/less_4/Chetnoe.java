package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Chetnoe {
    public static void main(String[] args) {
        Scanner scanChetnoe = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = scanChetnoe.nextInt();

        boolean res =numb %2 == 0;
        System.out.println(res);
    }
}
