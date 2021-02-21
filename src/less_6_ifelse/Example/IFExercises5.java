package less_6_ifelse.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 */
public class IFExercises5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Сложение");
                break;
            case 2:
                System.out.println("Вычитание");
                break;
            case 3:
                System.out.println("Умножение");
                break;
            default:
                System.out.println("Неизвестная операция");
                break;
        }
    }
}
