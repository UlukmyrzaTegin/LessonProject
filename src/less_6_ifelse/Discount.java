package less_6_ifelse;

import java.util.Scanner;

/**
 * TheSusanin
 * 16 февраль 2021
 */

public class Discount {
    public static void main(String[] args) {
        Scanner scanDiscount = new Scanner(System.in);
        System.out.print("Введите суммы: ");
        double price = scanDiscount.nextDouble();

        System.out.print("Введите тип карт: ");
        String card = scanDiscount.next();

        if (card.equals("SILVER")) {
            price *= 0.95; // 5%
            System.out.println(" У вас скидка составляет - 5%");
        }else if (card.equals("GOLD")) {  // Если сумма больше 10000 сомов то, 10% скидка, иначе 5%
            //вложенный конструктор
          /* 1. if - else
           if (price > 10000) {
                price *= 0.9;
            } else {
                price *=0.95;
            }
           */
            // 2. тренарный оператор
            price *= price > 10000 ? 0.9 : 0.95;

        }else if (card.equals("PLATINUM"))
            price *= 0.7;
        else
            System.out.println("Нет такой карты");
        System.out.println("Итоговая цена: " + price);
    }
}
