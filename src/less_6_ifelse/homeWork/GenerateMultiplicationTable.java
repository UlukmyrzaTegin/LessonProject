package less_6_ifelse.homeWork;

import java.util.Random;
import java.util.Scanner;

/**
 * TheSusanin
 * TheSusanin
 * 18 февраль 2021
 */
public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        // Задача, проверка таблицы умножения случайным (генератор) образом
        int correctAnswers = 0;
        Random numGenerator = new Random();
        Scanner scanGenerator = new Scanner(System.in);
        int[] nums = new int[2];
        while (correctAnswers != 3) {
            nums[0] = numGenerator.nextInt(9) + 1;
            nums[1] = numGenerator.nextInt(9) + 1;
            System.out.print(nums[0] + " * " + nums[1] + " = ");
            int answer = numGenerator.nextInt();
            if (answer == nums[0] * nums[1]) {
                System.out.println("Правильно.");
                ++correctAnswers;
            } else
                System.out.println("Неправильно. Попробуйте еще раз.");
        }
        System.out.println("Завершение.");
    }

}
