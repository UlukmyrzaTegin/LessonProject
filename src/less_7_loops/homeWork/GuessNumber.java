package less_7_loops.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class GuessNumber {
    public static void main(String[] args) {
        int moreNumer = 0;
        int lessNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Отгадайте число за 8 попыток");
            for (int i = 0; i < 8; i++) {
                int random = (int) (Math.random() * ((99 - 2)+1))+2;
               // System.out.println("Секретное число: " + random); здесь могу узнать, генерирующий код
                System.out.print(" Вводите ваше число: ");
                int answer = scanner.nextInt();
                System.out.print("Вы ввели число "+ answer);
                if (answer == random) {
                    System.out.println("Вы угадали.");
                } else if (answer > random) {
                    System.out.println(" Загаданое число меньше вашего.");
                    ++moreNumer;
                } else if (answer < random) {
                    System.out.println(" Загадоное число больше вашего.");
                    ++lessNumber;
                }
            }
            System.out.println("Вы ввели " + moreNumer + " раза меньше. " + " И " + lessNumber + " раза больше.");
        }
    }

