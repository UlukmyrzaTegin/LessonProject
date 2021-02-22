package less_7_loops.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 */
public class SaveMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" start amount: ");
        double myMoney = scanner.nextDouble();
        System.out.print(" final amount: ");
        double finalMoney = scanner.nextDouble();

        while (myMoney < finalMoney) {
            System.out.print("transaction: ");
            double transaction = scanner.nextDouble();
            myMoney += transaction;
            System.out.println("cur amount =" + myMoney);
        }
        System.out.println("Got it! My money =" + myMoney);
    }
}
