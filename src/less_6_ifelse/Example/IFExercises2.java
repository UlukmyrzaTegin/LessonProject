package less_6_ifelse.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 * Если число одновременно меньше 9 и больше 2, то программа выводит "Число больше 5 и меньше 10".
 * Иначе программа выводит сообщение "Неизвестное число".
 */
public class IFExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if (num > 2 && num < 9) {
            System.out.println("Число больше 2 и меньше 9");
        } else
            System.out.println("Неизвестное число");
    }

}
