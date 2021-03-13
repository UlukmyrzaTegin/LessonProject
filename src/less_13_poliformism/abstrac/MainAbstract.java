package less_13_poliformism.abstrac;

import less_13_poliformism.abstrac.models.Bicycle;
import less_13_poliformism.abstrac.models.Bus;
import less_13_poliformism.abstrac.models.Car;

/**
 * TheSusanin
 * 3/13/2021 Mar 2021
 */
public class MainAbstract {
    public static void main(String[] args) {
        Car car = new Car("Mers", "212", 2020);
        car.reverse();
        Bus bus = new Bus("Volvo", "VT-514", 2018);
        bus.drive();
        Bicycle bicycle = new Bicycle("Stels", "Navigator", 2020);
        bicycle.stop();
    }
}
