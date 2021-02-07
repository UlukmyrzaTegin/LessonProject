package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Delenie {
    public static void main(String[] args) {
        Scanner scanDelenie = new Scanner(System.in);
        System.out.println("Введите число первое");
        int chisloPervoe = scanDelenie.nextInt();
        System.out.println("Введите число второе");
        int chisloVtoroe = scanDelenie.nextInt();

        boolean resDelenie = chisloPervoe % 2 == 0;
        System.out.println(resDelenie);
    }
}
