package less_3;

import java.util.Scanner;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Landau {
    public static void main(String[] args) {
        System.out.println("\n Формула красоты от Ландау");
        Scanner scanLandau = new Scanner(System.in);

        System.out.println("Введите бюст в сантиметрах:");
        double buist = scanLandau.nextDouble();
        System.out.println("Введите бедер в сантиметрах");
        double beder = scanLandau.nextDouble();
        System.out.println("Введите свой рост в сантиметрах:");
        double rost = scanLandau.nextDouble();
        System.out.println("Введите обхват талии в сантиметрах");
        double taliya = scanLandau.nextDouble();
        System.out.println("Введите свой вес в килограммах ");
        double ves = scanLandau.nextDouble();


        float resLandau = (float) ((buist * beder * rost) / ((taliya*taliya) * ves));
        System.out.println(resLandau);
    }
}
