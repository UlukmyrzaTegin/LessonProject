package less_6_ifelse.Exercises;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 *  А программа сранивает два введенных числа и выводит на консоль результат сравнения
 *  (два числа равны, первое число больше второго или первое число меньше второго).
 */
public class IFExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int first = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();
        if (first > second) {
            System.out.println("Первое число больше второго");
        } else if (first < second) {
            System.out.println("Первое число меньше второго.");
        } else
            System.out.printf("Оба числы %d = %d равны.", first, second);
    }
}
