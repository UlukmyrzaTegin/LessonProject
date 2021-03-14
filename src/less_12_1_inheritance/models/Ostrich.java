package less_12_1_inheritance.models;

/**
 * TheSusanin
 * 3/14/2021
 */
public class Ostrich extends Birds {

    public Ostrich(String name) {
        super(name);
    }

    public void hideHead() {
        System.out.println("I'm Ostrich and I'm scared");
    }
}
