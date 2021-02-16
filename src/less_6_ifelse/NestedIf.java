package less_6_ifelse;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/16/2021 Feb 2021
 */
public class NestedIf {
    public static void main(String[] args) {
        // Программа на Java для демонстрации использования вложенного оператора If.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш возраст? ");
        int age = scanner.nextInt();
        System.out.println("Ваш вес? ");
        int weight = scanner.nextInt();

        if (age >=18) {
            if (weight > 50) {
                System.out.println("Вы имеете право сдавать кровь");
            } else {
                System.out.println("Вы не имеете право сдавать кровь");
            }
        } else {
            System.out.println("Возраст должен быть больше 18");
        }

    }
}
