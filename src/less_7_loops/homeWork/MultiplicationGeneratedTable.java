package less_7_loops.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/19/2021 Feb 2021
 */
public class MultiplicationGeneratedTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  rightAnswer = 0;
        int totalScore = 0;
        System.out.println("Тест на проверку знания таблицы умножения: ");
        for (int i = 0; i < 10 ; i++) {
            int randomA = (int) (Math.random() * ((9-2)+1) + 2);
            int randomB = (int) (Math.random() * ((9-2)+1) + 2);
            System.out.print(randomA + " * " + randomB + " = ");
            int answer = scanner.nextInt();
            if (answer == (randomA * randomB)) {
                System.out.println("Правильно");
                ++rightAnswer;
            } else if (answer != (randomA * randomB)) {
                System.out.println("Неправильно. Попробуйте еще раз.");
                ++totalScore;
            }
        }
        System.out.println("Правильных ответов: " + rightAnswer + " из них неправильные: " + totalScore);
    }
}
