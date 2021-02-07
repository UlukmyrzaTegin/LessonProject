package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Sravnenie {
    public static void main(String[] args) {
        Scanner scanSrav = new Scanner(System.in);

        int number = (int) (Math.random() * (10 - 1)) + 1;
        System.out.println("Введите число");
        int myNumbe = scanSrav.nextInt();
        boolean res = myNumbe == number;
        System.out.println("res - " + res);
        System.out.println("number = " + number);
    }
}
