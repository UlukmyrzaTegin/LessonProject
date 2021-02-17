package less_6_ifelse.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 17 февраль 2021
 */
public class Taxi {
    public static void main(String[] args) {
        Scanner scanTaxi = new Scanner(System.in);
        System.out.println("Введите расход топлива машина на 100 км: ");
        int consumption = scanTaxi.nextInt();

        System.out.println("Введите расстояние в км до места: ");
        int distance = scanTaxi.nextInt();

        System.out.println("Введите цену бензина на данный момент: ");
        double price = scanTaxi.nextDouble();

        System.out.println("Введите суммы, предлагаемую пассажиром: ");
        int pricePassenger = scanTaxi.nextInt();

        System.out.println("Прибыль водителя в процентах: ");
        double profit = scanTaxi.nextDouble();

    }
}
