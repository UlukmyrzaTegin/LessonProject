package less_12_inheritance.classWork;

import less_12_inheritance.classWork.models.Bike;
import less_12_inheritance.classWork.models.Bus;
import less_12_inheritance.classWork.models.Horse;
import less_12_inheritance.classWork.models.Mashine;

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
