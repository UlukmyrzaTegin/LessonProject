package less_6_ifelse.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 18 февраль 2021
 */
public class Coordinates {
    public static void main(String[] args) {
        Scanner scanCoordinate = new Scanner(System.in);
        System.out.println("Введите координата х: ");
        int x = scanCoordinate.nextInt();
        System.out.println("Введите координата у: ");
        int y = scanCoordinate.nextInt();

        if (x>0 && y>0) {
            System.out.println("Она принадлежит к первой четверти");
        } else if (x<0 && y>0) {
            System.out.println("Она принадлежит к второй четверти");
        } else if (x<0 && y<0) {
            System.out.println("Она принадлежит к третьей четверти");
        } else if (x>0 && y<0) {
            System.out.println("Она принадлежит к четвертой черверти");
        }
    }
}
