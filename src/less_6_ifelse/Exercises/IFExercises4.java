package less_6_ifelse.Exercises;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 * В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться.
 * Напишите консольную программу, в которую пользователь вводит сумму вклада.
 * Если сумма вклада меньше 100, то начисляется 5%. Если сумма вклада от 100 до 200, то начисляется 7%.
 * Если сумма вклада больше 200, то начисляется 10%. В конце программа должна выводить сумму вклада с начисленными процентами.
 */
public class IFExercises4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сумма вклада: ");
        double price = scanner.nextDouble();

        if (price < 100) {
            price *=  0.05;
            System.out.println("Начислено - 5%");
        }
        else if (price >= 100 && price <= 200) {
            price *= 0.07;
            System.out.println("Начислено - 7%");
        }
        else {
            price *= 0.1;
            System.out.println("Начислено - 10%");
        }
        System.out.printf("Сумму вклада после начисления процентов: %f", price);
    }
}
