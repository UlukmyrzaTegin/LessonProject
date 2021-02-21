package less_6_ifelse.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 * Если число либо равно 2, либо равно 9, то программа выводит "Число либо равно 2, либо равно 9".
 * Иначе программа выводит сообщение "Неизвестное число".
 */
public class IFExercises3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if (num == 2 || num == 9){
            System.out.println("Число либо равно 2, либо равно 9");
        } else
            System.out.println("Неизвестное число");
    }
}
