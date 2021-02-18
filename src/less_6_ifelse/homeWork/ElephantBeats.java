package less_6_ifelse.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 18 февраль 2021
 */
public class ElephantBeats {
    public static void main(String[] args) {
        Scanner scanElephan = new Scanner(System.in);
        System.out.println("Введите координаты слона x1: ");
        byte x1 = scanElephan.nextByte();
        System.out.println("Введите координаты слона x2: ");
        byte x2 = scanElephan.nextByte();
        System.out.println("Введите координаты фигуры у1: ");
        byte y1 = scanElephan.nextByte();
        System.out.println("Введите координаты фигуры у2: ");
        byte y2 = scanElephan.nextByte();

        if ((x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2)) {
            System.out.println("Слон бьет фигуру");
        } else {
            System.out.println("Слон не бьет фигуру");
        }
    }
}
