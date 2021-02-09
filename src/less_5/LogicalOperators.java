package less_5;

import java.util.Scanner;

/**
 * TheSusanin
 * 09 февраль 2021
 */
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanLogical = new Scanner(System.in);

        System.out.println("Введите true/false для а");
        boolean a = scanLogical.nextBoolean();
        System.out.println("Введите true/false для b");
        boolean b = scanLogical.nextBoolean();

        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b);
    }
}
