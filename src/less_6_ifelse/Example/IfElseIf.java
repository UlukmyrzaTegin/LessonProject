package less_6_ifelse.Example;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/16/2021 Feb 2021
 */
public class IfElseIf {
    public static void main(String[] args) {
        // Это программа системы выставления оценок за отказ, оценку D, оценку C, оценку B, оценку A и A +.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку: ");
        int mark = scanner.nextInt();

        if (mark < 50) {
            System.out.println("Cбой");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Оценка D");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Троечку");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Оценка B");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Оценка");
        } else if (mark >= 90 && mark < 100) {
            System.out.println("Оценка А +");
        } else {
            System.out.println("Неверно!");
        }
    }
}
