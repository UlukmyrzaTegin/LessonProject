package less_6_ifelse;

import java.util.Scanner;

/**
 * TheSusanin
 * 16 февраль 2021
 */
public class IFELSE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        double price;

        if (age > 14) {
            price = 500;
            System.out.printf("Ваш возраст %d, билет стоит ", age);
        } else {
            price = 200;
            System.out.printf("Ваш возраст %d, билет стоит ", age);
        }
     //  тренарный оператор price = age > 14 ? 500: 200;
        System.out.println(price);
    }
}
