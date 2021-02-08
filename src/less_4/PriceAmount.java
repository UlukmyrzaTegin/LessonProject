package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * 08 февраль 2021
 */
public class PriceAmount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену");
        int price = scanner.nextInt();

        System.out.println("Введите суммы который у вас есть");
        int amount = scanner.nextInt();

        boolean res = price < amount;
        System.out.println("Результат: " + res);
    }
}
