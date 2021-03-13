package less_13_poliformism.abstrac.models;

/**
 * TheSusanin
 * 3/13/2021 Mar 2021
 */
public class Car extends Transport {
    public Car(String name, String model, int year) {
        super(name, model, year);
    }

    @Override
    public void drive() {

    }

    @Override
    public void reverse() {
        System.out.println(getName() + " - Назад дай");

    }

    @Override
    public void stop() {

    }
}
