package less_6_ifelse.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/16/2021 Feb 2021
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanYear = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanYear.nextInt();
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.printf("%d является високосным годом ", year);
        } else {
            System.out.println("%d является общим годом ");
        }
    }
}
