package less_7_loops.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class Deposit {
    public static void main(String[] args) {
        float sum, prcent, years;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        sum = scanner.nextFloat();
        System.out.println("Введите процентную ставку: ");
        prcent = scanner.nextFloat();
        System.out.println("Введите срок в месяцах");
        years = scanner.nextInt();

        System.out.println("Депозит в размере " + sum + " сомах под " + prcent + "% годовых на " + years + " месяцев");
        for (int i = 1; i < years+1 ; i++) {
            sum = (sum * prcent * years) / 100;
            System.out.printf("Месяц - " + i + " Сумма: " + "%,.2f сомов \n", sum);
        }
        System.out.printf("За 12 месяцев вы получите " + "%,.2f сомов \n", sum);
    }
}
