package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * 08 февраль 2021
 */
public class Arifmetica {
    public static void main(String[] args) {
        System.out.println("Вводите 4 числа и проверьте, среднее арифметическое кратно 3 \n");
        Scanner scanArif = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int first = scanArif.nextInt();

        System.out.println("Введите второе число:");
        int second = scanArif.nextInt();

        System.out.println("Введите третье число:");
        int three = scanArif.nextInt();

        System.out.println("Введите четвертое число:");
        int four = scanArif.nextInt();

        float res = first + second + three + four;
        System.out.println("Среднее арифметическое значение четырех чисел равен: " + res);

        boolean resArif = res % 3 == 0;
        System.out.println("Результат: " + resArif);
    }
}
