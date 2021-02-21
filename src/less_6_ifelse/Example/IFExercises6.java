package less_6_ifelse.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 */
public class IFExercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextInt();
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение 4.Деление");
        int operation = scanner.nextInt();
        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Неизвестная операция");
        }
        if (operation >=1 && operation <=4) {
            System.out.printf("Результат операции: %f", result);
        }
    }
}
