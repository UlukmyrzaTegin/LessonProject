package less_13_poliformism.abstrac.models;

/**
 * TheSusanin
 * 3/13/2021 Mar 2021
 */
public class Bicycle extends Transport {
    public Bicycle(String name, String model, int year) {
        super(name, model, year);
    }

    @Override
    public void drive() {

    }

    @Override
    public void reverse() {

    }

    @Override
    public void stop() {
        System.out.println(getName() +" - Тормози");

    }
}
