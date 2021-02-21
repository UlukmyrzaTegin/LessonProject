package less_7_loops.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 */
public class Deposit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумма вклада: ");
        double finalMoney = scanner.nextDouble();
        System.out.print("Введите срок в месяцах: ");
        int months = scanner.nextInt();
        System.out.print("Введите капитализацию: ");
        int capitalization = scanner.nextInt();
        System.out.print("Введите процентную ставку: ");
        double percent = scanner.nextInt();

        double calcPercents = 0, myMoney = 0;
        for (int i = 1; i < months ; i++) {
            System.out.print("Сумма: ");
            double currMoney = scanner.nextDouble();

            myMoney += currMoney;
            if (i % capitalization == 0) {
                double currPercents = finalMoney * percent / 100;
                calcPercents += currPercents;
                myMoney += currPercents;
            }
            if (myMoney >= finalMoney)
                break;
        }
        System.out.println("Сумма = " + myMoney);
        System.out.println("Процент = " + calcPercents);

    }
}
