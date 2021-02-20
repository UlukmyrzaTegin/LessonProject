package less_6_ifelse.ExampleSwitch;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter you number: ");
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("No in 10, 20 or 30");
        }
    }
}
