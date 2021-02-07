package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/8/2021 Feb 2021
 */
public class NeRavenstvo {
    public static void main(String[] args) {
        Scanner scanPin = new Scanner(System.in);
        int pin = 1234;
        System.out.println("Введите пин: ");
        int myPin = scanPin.nextInt();
        boolean res = pin != myPin;
        System.out.println(res);
    }
}
