package less_13_poliformism.abstrac.models;

/**
 * TheSusanin
 * 3/13/2021 Mar 2021
 */
public class Bus extends Transport {
    public Bus(String name, String model, int year) {
        super(name, model, year);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " - Водить автобус");

    }

    @Override
    public void reverse() {

    }

    @Override
    public void stop() {

    }
}
