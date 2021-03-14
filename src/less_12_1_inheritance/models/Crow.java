package less_12_1_inheritance.models;

/**
 * TheSusanin
 * 3/14/2021
 */
public class Crow extends Birds {

    public Crow(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("I Crow and I Fly");
    }
}
