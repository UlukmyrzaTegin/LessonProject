package less_7_loops.Multiplication;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/19/2021 Feb 2021
 */
public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 1; i < 10 ; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
