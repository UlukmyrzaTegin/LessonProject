package less_7_loops.Multiplication;

import java.util.Random;
import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class MultiplicationRandom {
    // Таблица умножения, предлагаются до тех пор пока пользователь не решит 5 подряд правильно.
    public static void main(String[] args) {
        int correctAnswers = 0;
        int totalAnswers = 0;
        Random numGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Тест на проверку знания таблицы умножения: ");
        int[] nums = new int[2];
        while(correctAnswers != 5) {
            nums[0] = numGenerator.nextInt(9) + 1;
            nums[1] = numGenerator.nextInt(9) + 1;
            System.out.print(nums[0] + " * " + nums[1] + " = ");
            int answer = scanner.nextInt();
            if (answer == nums[0] * nums[1]) {
                System.out.println("Правильно.");
                ++correctAnswers;
            } else if (answer != nums[0] * nums[1]) {
                System.out.println("Неправильно. Попробуйте еще раз.");
                ++totalAnswers;
            }
        }
        System.out.println("Правильных ответов: " + correctAnswers + " и " + totalAnswers + " раз ответили неправильно.");
    }
}
