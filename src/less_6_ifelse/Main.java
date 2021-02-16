package less_6_ifelse;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/15/2021 Feb 2021
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanMain = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanMain.nextInt();
        if (a == 15) {
            System.out.printf("Введенное число %d = " + a, a);
        } else if (a > 20) {
            if (a % 2 == 0){
                System.out.printf("Введенное число %d четное", a);
            }
            System.out.printf("\n Введенное число %d > 20", a);
        } else if (a < 10) {
            System.out.printf("Введенное число %d < 10", a);
        } else {
            System.out.printf("Введенное число %d != 15", a);
            System.out.println("\n after if");
        }

        //b = a == 15 ? 20 : 10; тернарный оператор
    }
}
