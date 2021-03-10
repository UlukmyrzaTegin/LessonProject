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
        client.getMoney();



        Bus bus = new Bus("Scania","A80", "3",  "DSC9");
        System.out.println();
        bus.drive();

        Horse horse = new Horse();
        horse.noHorse();

        Bike bike = new Bike("Stels", "Pilot 710","","");
        bike.stop();

        Mashine mashine = new Mashine("Mers", "212W", "4", "ОМ626");
        mashine.reverse();
    }
}
