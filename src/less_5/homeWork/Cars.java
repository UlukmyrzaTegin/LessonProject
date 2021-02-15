package less_5.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 12 февраль 2021
 */
public class Cars {
    public static void main(String[] args) {
        Scanner scanCar = new Scanner(System.in);

            System.out.print("Модел машина: ");
            String modelCar = scanCar.next();

            System.out.print("Год выпуска: ");
            int yearCar = scanCar.nextInt();

            System.out.print("Пробег: ");
            int mileage = scanCar.nextInt();

            System.out.print("Цвет: ");
            String colorCar = scanCar.next();

            System.out.print("Руль: ");
            String steeringWheel = scanCar.next();

            System.out.print("Хозяин: ");
            int master = scanCar.nextInt();

            System.out.print("Цена: ");
            int price = scanCar.nextInt();

            boolean resCar = (((modelCar.equals("Lexus") || modelCar.equals("Toyota") && yearCar >= 2004 ) && mileage <= 150000) && colorCar.equals("white") || (colorCar.equals("grey") && steeringWheel.equals("left") && master >= 2 && price !=10000)) || (mileage == 200000 && price < 8000);
           System.out.print("Результат: "+ resCar);

            /*
            <=10000
            Тойота || Лексус
            2004
            белый || серый
            2 хозяина
            леворульный
             */
    }
}
