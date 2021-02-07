package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/7/2021 Feb 2021
 */
public class Ravenstvo {

    public static void main(String[] args) {
        Scanner scanSrav = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanSrav.nextInt();
        boolean res = num > 0;
        System.out.println(res);
    }
}
