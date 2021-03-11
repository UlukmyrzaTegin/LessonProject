package less_12_inheritance.classWork;

import less_12_inheritance.classWork.models.*;

/**
 * TheSusanin
 * 3/5/2021 Mar 2021
 */
public class Main {
    public static void main(String[] args) {

        Cooker cooker = new Cooker("A", 24);
        cooker.relax();
        Client client = new Client("B", 32, 1500);
        client.relax();
        Administrator administrator = new Administrator("C", 21);
        administrator.walk();
        administrator.relax();

        Bus bus = new Bus("Volvo", "DM", "2","V454");
        bus.drive();
        bus.stop();

        Horse horse = new Horse("Тулпар", "Araba", "2","");
        horse.noHorse();

        Bike bike = new Bike("Stels", "Navigators", "","");
        bike.stop();

        Mashine mashine = new Mashine("Mers", "212", "4","W111");
        mashine.reverse();
    }
}
