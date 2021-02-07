package less_3;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/7/2021 Feb 2021
 */
public class IncomeTax {
    public static void main(String[] args) {
        int total, score;
        float percentae;

        Scanner scanInput = new Scanner(System.in);

        System.out.println("Введите общий или максимальный балл");
        total = scanInput.nextInt();

        System.out.println("Введите полученный балл");
        score = scanInput.nextInt();

        percentae = (score * 100 / total);
        System.out.println("Всего = " + percentae + "%");
    }
}
