package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * 08 февраль 2021
 */
public class AbonPlata {
    public static void main(String[] args) {
        //int abonent = 145;
        //int balance = 145;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите абонентскую плату: ");
        int abonent = scanner.nextInt();

        System.out.println("Введите баланс: ");
        int balance = scanner.nextInt();

        // Чтобы подключиться к пакету, баланс должен превышать абонентскую плату
        boolean result = balance > abonent;
        System.out.println("Результат: " + result);
    }
}
