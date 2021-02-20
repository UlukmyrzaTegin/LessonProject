package less_6_ifelse.homeWork;

import org.w3c.dom.ls.LSOutput;

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
        int price = scanTaxi.nextInt();
        System.out.println("Введите суммы, предлагаемую пассажиром: ");
        int pricePassenger = scanTaxi.nextInt();

      //  System.out.println("Прибыль водителя в процентах: ");
        double profit = 0.30; // scanTaxi.nextFloat();

        double cousu = (100 * consumption);
      //  System.out.println("Расход топливо составляет в граммах " + cousu);
        double distanceConsu =  (distance * cousu);
      //  System.out.println("Количество потраченного топливо от пункта А до Б составляет в граммах " + distanceConsu);
        double priceDistance = (distanceConsu * price);
        System.out.println("Сумма за потроченного топливо составляет " + priceDistance);

        if (distance < 1) {
            double netProfit =  (priceDistance - pricePassenger);
            System.out.println("Прибыль водителя составляет " + netProfit);
            System.out.println("Хочу заработать 50");
            if (distance < distance) {
                System.out.println("Заработок 150");
            }
            System.out.println("Заработок 300");
        }

    /*    if (netProfit < pricePassenger) {
            netProfit *= 0.30;
        } else if(netProfit == pricePassenger) {
            System.out.println("ne menyat");
        }

     */
    }
}
