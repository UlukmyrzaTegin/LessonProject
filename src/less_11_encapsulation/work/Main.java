package less_11_encapsulation.work;

import less_11_encapsulation.work.models.Bike;
import less_11_encapsulation.work.models.Bus;
import less_11_encapsulation.work.models.Horse;
import less_11_encapsulation.work.models.Mashine;

/**
 * TheSusanin
 * 3/5/2021 Mar 2021
 */
public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.drive();

        Horse horse = new Horse();
        horse.reverse();

        Bike bike = new Bike();
        bike.stop();

        Mashine mashine = new Mashine();
        mashine.getModel();

    }


}
