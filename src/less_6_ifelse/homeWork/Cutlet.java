package less_6_ifelse.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 18 февраль 2021
 */
public class Cutlet {
    public static void main(String[] args) {
        int time;
        Scanner scanCutlen = new Scanner(System.in);
        System.out.print("Введите котлет: ");
        int k = scanCutlen.nextInt();
        System.out.print("Введите время в минутах: ");
        int m = scanCutlen.nextInt();
        System.out.print("Введите все котлеты ");
        int n = scanCutlen.nextInt();

        if (n <= k) {
            time = 2 * m;
        } else if (n*2 % k==0) {
            time = m* (n*2/k);
        } else
            time = m*(1+(n*2/k));

/*   это формула Долона
        if (n <= k) {
            time = m * 2;
        } else if (n % k == 0) {
            time = n / k * m * 2;
        } else {
            time = (n / k + 1) * m * 2;
        }
 */
        System.out.println("Чтобы пожарить котлет с обеих сторон, требуются время " + time + " минут");
    }
}
