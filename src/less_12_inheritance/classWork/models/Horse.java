package less_12_inheritance.classWork.models;

/**
 * TheSusanin
 * 3/5/2021 Mar 2021
 */
public class Horse extends Car {

    public Horse(String name, String model, String door, String engine) {
        super(name, model, door, engine);
    }

    @Override
    public void noHorse() {
        System.out.println(getName() + " - Но, но..");
        super.noHorse();
    }
}
