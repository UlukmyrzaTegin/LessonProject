package less_12_inheritance.classWork.models;

/**
 * TheSusanin
 * 3/5/2021 Mar 2021
 */
public class Bus extends Car {

    public Bus(String name, String model, String door, String engine) {
        super(name, model, door, engine);
    }

    @Override
    public void drive() {
        System.out.println("Газуй!");
        super.drive();
    }
}
