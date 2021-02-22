package less_6_ifelse.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/16/2021 Feb 2021
 */
public class IfElseTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String output=(number % 2 == 0) ? "число четное" : "число нечетное";
        System.out.println(output);
    }
}
