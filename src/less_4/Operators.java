package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/7/2021 Feb 2021
 */
public class Operators {
    public static void main(String[] args) {
        //int a = 12, b = 23;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();

        boolean res = a == b;
        System.out.println("a==b: " + res);

        res = a > b;
        System.out.println("a>b: " + res);

        res = a < b;
        System.out.println("a<b: " + res);

        res = a != b;
        System.out.println("a!=b: " + res);
    }
}
