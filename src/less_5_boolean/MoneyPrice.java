package less_5_boolean;

import java.util.Scanner;

/**
 * TheSusanin
 * 12 февраль 2021
 */
public class MoneyPrice {
    public static void main(String[] args) {
        Scanner scanMoney = new Scanner(System.in);

        System.out.print("Введите суммы: ");
        int money = scanMoney.nextInt();

        System.out.print("Введите цены: ");
        int price = scanMoney.nextInt();

        System.out.print("Нужен ли мне вещь? ");
        boolean isNeed = scanMoney.nextBoolean();

        boolean rusBuy = money >= price & isNeed;
        System.out.println("Результат: " + rusBuy);
    }
}
